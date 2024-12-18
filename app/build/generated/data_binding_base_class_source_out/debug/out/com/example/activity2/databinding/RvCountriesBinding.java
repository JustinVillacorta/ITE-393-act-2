// Generated by view binder compiler. Do not edit!
package com.example.activity2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.activity2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RvCountriesBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final CardView main;

  @NonNull
  public final TextView tvCapital;

  @NonNull
  public final TextView tvName;

  private RvCountriesBinding(@NonNull CardView rootView, @NonNull ImageView imageView,
      @NonNull CardView main, @NonNull TextView tvCapital, @NonNull TextView tvName) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.main = main;
    this.tvCapital = tvCapital;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static RvCountriesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RvCountriesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.rv_countries, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RvCountriesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      CardView main = (CardView) rootView;

      id = R.id.tvCapital;
      TextView tvCapital = ViewBindings.findChildViewById(rootView, id);
      if (tvCapital == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      return new RvCountriesBinding((CardView) rootView, imageView, main, tvCapital, tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
