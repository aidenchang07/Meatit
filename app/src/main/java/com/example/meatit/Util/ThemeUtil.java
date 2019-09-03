package com.example.meatit.Util;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDelegate;

import com.example.meatit.R;

import static com.example.meatit.Config.SharedPrefConfig.NightModeState_DarkTheme;

public class ThemeUtil {

    public ThemeUtil() {
    }

    // Read the file and store the value in the variable
    public static void initTheme(@NonNull final Activity activity) {
        int isDark = NightModeSharedPrefUtil.loadNightModeState(activity);

        if (isDark == NightModeState_DarkTheme) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            // If it is null, then set false
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }

    // Set the theme
    public static void setTheme(@NonNull final Activity activity){
        int isDark = AppCompatDelegate.getDefaultNightMode();

        if (isDark == NightModeState_DarkTheme) {
            activity.setTheme(R.style.DarkTheme);
        } else {
            // If it is null, then set false
            activity.setTheme(R.style.LightTheme);
        }
    }

    // Reread if the theme changed
    public static void loadTheme(@NonNull final Activity activity, int currentNightModeState) {
        int isDark = AppCompatDelegate.getDefaultNightMode();
        if (isDark != currentNightModeState) {
            // Restart the activity
            activity.recreate();
        }
    }

}
