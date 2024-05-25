package com.dicoding.subintermidiatesatu.view.upload;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00060\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\r0\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006 "}, d2 = {"Lcom/dicoding/subintermidiatesatu/view/upload/UploadActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/dicoding/subintermidiatesatu/databinding/ActivityUploadBinding;", "currentImageUri", "Landroid/net/Uri;", "launcherGallery", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/PickVisualMediaRequest;", "kotlin.jvm.PlatformType", "launcherIntentCamera", "requestPermissionLauncher", "", "viewModel", "Lcom/dicoding/subintermidiatesatu/view/upload/UploadViewModel;", "getViewModel", "()Lcom/dicoding/subintermidiatesatu/view/upload/UploadViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "isPermissionsGranted", "", "permission", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showImage", "startCamera", "startGallery", "uploadImage", "Companion", "app_debug"})
public final class UploadActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable
    private android.net.Uri currentImageUri;
    private com.dicoding.subintermidiatesatu.databinding.ActivityUploadBinding binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<androidx.activity.result.PickVisualMediaRequest> launcherGallery = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<android.net.Uri> launcherIntentCamera = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String REQUIRED_PERMISSION = "android.permission.CAMERA";
    @org.jetbrains.annotations.NotNull
    public static final com.dicoding.subintermidiatesatu.view.upload.UploadActivity.Companion Companion = null;
    
    public UploadActivity() {
        super();
    }
    
    private final com.dicoding.subintermidiatesatu.view.upload.UploadViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean isPermissionsGranted(java.lang.String permission) {
        return false;
    }
    
    private final void startGallery() {
    }
    
    private final void showImage() {
    }
    
    private final void startCamera() {
    }
    
    private final void uploadImage() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dicoding/subintermidiatesatu/view/upload/UploadActivity$Companion;", "", "()V", "REQUIRED_PERMISSION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}