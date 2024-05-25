package com.dicoding.subintermidiatesatu.view.maps

import android.content.pm.PackageManager
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import com.dicoding.subintermidiatesatu.R
import com.dicoding.subintermidiatesatu.data.Result
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.dicoding.subintermidiatesatu.databinding.ActivityMapsBinding
import com.dicoding.subintermidiatesatu.view.ViewModelFactory
import com.google.android.gms.maps.model.MapStyleOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    private val viewModel by viewModels<MapsViewModel> {
        ViewModelFactory.getInstance(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.maps) as SupportMapFragment
        mapFragment.getMapAsync(this)

    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val masjidNamira = LatLng(-7.152366, 112.409306)

        mMap.uiSettings.isZoomControlsEnabled = true
        mMap.uiSettings.isIndoorLevelPickerEnabled = true
        mMap.uiSettings.isCompassEnabled = true
        mMap.uiSettings.isMapToolbarEnabled = true

        mMap.addMarker(
            MarkerOptions()
                .position(masjidNamira)
                .title("Masjid Namira Lamongan")
                .snippet("Tempat ibadah kontemporer umat islam")
        )
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(masjidNamira, 15f))

        getMyLocation()
        setMapStyle()

        viewModel.getStoriesWithLocation().observe(this) { story ->
            if (story != null) {
                when (story) {
                    is Result.Loading -> {
                        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
                    }

                    is Result.Success -> {
                        story.data.forEach { data ->
                            if (data.lat != null && data.lon != null) {
                                val latLng = LatLng(data.lat, data.lon)
                                mMap.addMarker(
                                    MarkerOptions()
                                        .position(latLng)
                                        .title(data.name)
                                        .snippet(data.description)
                                )
                            }
                        }
                    }

                    is Result.Error -> {
                    }
                }
            }
            binding.topAppBarMaps.setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.normal_type -> {
                        mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
                        true
                    }

                    R.id.terrain_type -> {
                        mMap.mapType = GoogleMap.MAP_TYPE_SATELLITE
                        true
                    }

                    R.id.satellite_type -> {
                        mMap.mapType = GoogleMap.MAP_TYPE_TERRAIN
                        true
                    }

                    R.id.hybrid_type -> {
                        mMap.mapType = GoogleMap.MAP_TYPE_HYBRID
                        true
                    }

                    else -> {
                        super.onOptionsItemSelected(menuItem)
                    }
                }
            }

        }
    }

    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted: Boolean ->
        if (isGranted) {
            getMyLocation()
        }
    }

    private fun getMyLocation() {
        if (ContextCompat.checkSelfPermission(
                this.applicationContext,
                android.Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            mMap.isMyLocationEnabled = true
        } else {
            requestPermissionLauncher.launch(android.Manifest.permission.ACCESS_FINE_LOCATION)
        }
    }

    private fun setMapStyle() {
        try {
            val success =
                mMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(this, R.raw.map_style))
            if (!success) {
                Log.e(TAG, "Style parsing failed.")
            }
        } catch (exception: Resources.NotFoundException) {
            Log.e(TAG, "Can't find style. Error: ", exception)
        }
    }

    companion object {
        private const val TAG = "MapsActivity"
    }
}