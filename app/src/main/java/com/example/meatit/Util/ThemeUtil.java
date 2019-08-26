package com.example.meatit.Util;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.example.meatit.R;

public class ThemeUtil {

    public ThemeUtil() {
    }

    public static void setTheme(@NonNull final Activity activity) {
        Boolean isLight = NightModeSharedPrefUtil.loadNightModeState(activity);
        activity.setTheme(isLight ? R.style.LightTheme : R.style.DarkTheme);
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
