package com.example.meatit.Util;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.example.meatit.R;

public class ThemeUtil {

    public ThemeUtil() {
    }

    public static void setTheme(@NonNull final Activity activity) {
        Boolean isDark = NightModeSharedPrefUtil.loadNightModeState(activity);
        activity.setTheme(isDark ? R.style.DarkTheme : R.style.LightTheme);
    }

    public static void reCreateOnThread(@NonNull final Activity activity) {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity.recreate();
            }
        });
    }

}
