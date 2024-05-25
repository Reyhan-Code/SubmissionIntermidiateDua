// Generated by view binder compiler. Do not edit!
package com.dicoding.subintermidiatesatu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dicoding.subintermidiatesatu.R;
import com.dicoding.subintermidiatesatu.view.custom.PasswordCv;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputEditText emailEditText;

  @NonNull
  public final TextInputLayout emailEditTextLayout;

  @NonNull
  public final TextView emailTextView;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Guideline guidelineHorizontal;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ProgressBar loadingProgressBar;

  @NonNull
  public final TextInputEditText nameEditText;

  @NonNull
  public final TextInputLayout nameEditTextLayout;

  @NonNull
  public final TextView nameTextView;

  @NonNull
  public final PasswordCv passwordEditText;

  @NonNull
  public final TextInputLayout passwordEditTextLayout;

  @NonNull
  public final TextView passwordTextView;

  @NonNull
  public final Button signupButton;

  @NonNull
  public final TextView titleTextView;

  private ActivitySignupBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputEditText emailEditText, @NonNull TextInputLayout emailEditTextLayout,
      @NonNull TextView emailTextView, @NonNull Guideline guideline2,
      @NonNull Guideline guidelineHorizontal, @NonNull ImageView imageView,
      @NonNull ProgressBar loadingProgressBar, @NonNull TextInputEditText nameEditText,
      @NonNull TextInputLayout nameEditTextLayout, @NonNull TextView nameTextView,
      @NonNull PasswordCv passwordEditText, @NonNull TextInputLayout passwordEditTextLayout,
      @NonNull TextView passwordTextView, @NonNull Button signupButton,
      @NonNull TextView titleTextView) {
    this.rootView = rootView;
    this.emailEditText = emailEditText;
    this.emailEditTextLayout = emailEditTextLayout;
    this.emailTextView = emailTextView;
    this.guideline2 = guideline2;
    this.guidelineHorizontal = guidelineHorizontal;
    this.imageView = imageView;
    this.loadingProgressBar = loadingProgressBar;
    this.nameEditText = nameEditText;
    this.nameEditTextLayout = nameEditTextLayout;
    this.nameTextView = nameTextView;
    this.passwordEditText = passwordEditText;
    this.passwordEditTextLayout = passwordEditTextLayout;
    this.passwordTextView = passwordTextView;
    this.signupButton = signupButton;
    this.titleTextView = titleTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emailEditText;
      TextInputEditText emailEditText = ViewBindings.findChildViewById(rootView, id);
      if (emailEditText == null) {
        break missingId;
      }

      id = R.id.emailEditTextLayout;
      TextInputLayout emailEditTextLayout = ViewBindings.findChildViewById(rootView, id);
      if (emailEditTextLayout == null) {
        break missingId;
      }

      id = R.id.emailTextView;
      TextView emailTextView = ViewBindings.findChildViewById(rootView, id);
      if (emailTextView == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = ViewBindings.findChildViewById(rootView, id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.guidelineHorizontal;
      Guideline guidelineHorizontal = ViewBindings.findChildViewById(rootView, id);
      if (guidelineHorizontal == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.loadingProgressBar;
      ProgressBar loadingProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (loadingProgressBar == null) {
        break missingId;
      }

      id = R.id.nameEditText;
      TextInputEditText nameEditText = ViewBindings.findChildViewById(rootView, id);
      if (nameEditText == null) {
        break missingId;
      }

      id = R.id.nameEditTextLayout;
      TextInputLayout nameEditTextLayout = ViewBindings.findChildViewById(rootView, id);
      if (nameEditTextLayout == null) {
        break missingId;
      }

      id = R.id.nameTextView;
      TextView nameTextView = ViewBindings.findChildViewById(rootView, id);
      if (nameTextView == null) {
        break missingId;
      }

      id = R.id.passwordEditText;
      PasswordCv passwordEditText = ViewBindings.findChildViewById(rootView, id);
      if (passwordEditText == null) {
        break missingId;
      }

      id = R.id.passwordEditTextLayout;
      TextInputLayout passwordEditTextLayout = ViewBindings.findChildViewById(rootView, id);
      if (passwordEditTextLayout == null) {
        break missingId;
      }

      id = R.id.passwordTextView;
      TextView passwordTextView = ViewBindings.findChildViewById(rootView, id);
      if (passwordTextView == null) {
        break missingId;
      }

      id = R.id.signupButton;
      Button signupButton = ViewBindings.findChildViewById(rootView, id);
      if (signupButton == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      TextView titleTextView = ViewBindings.findChildViewById(rootView, id);
      if (titleTextView == null) {
        break missingId;
      }

      return new ActivitySignupBinding((ConstraintLayout) rootView, emailEditText,
          emailEditTextLayout, emailTextView, guideline2, guidelineHorizontal, imageView,
          loadingProgressBar, nameEditText, nameEditTextLayout, nameTextView, passwordEditText,
          passwordEditTextLayout, passwordTextView, signupButton, titleTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
