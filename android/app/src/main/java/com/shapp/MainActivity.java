package com.shapp;

import com.imagepicker.permissions.OnImagePickerPermissionsCallback; // <- add this import
import com.facebook.react.modules.core.PermissionListener; // <- add this import

import com.facebook.react.ReactActivity;
import android.os.Bundle; 
import org.devio.rn.splashscreen.SplashScreen;

public class MainActivity extends ReactActivity {
 private PermissionListener listener;
  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "shapp";
  }
  @Override
    protected void onCreate(Bundle savedInstanceState) {
      SplashScreen.show(this); 
      super.onCreate(savedInstanceState);
  }
}
