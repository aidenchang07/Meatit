package com.example.meatit.Util;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.meatit.Config.SharedPrefConfig;
import com.example.meatit.Config.ThemeConfig;

public class NightModeSharedPrefUtil {

    public NightModeSharedPrefUtil() {
    }

    public static void setNightModeState(Context context, int state) {
        SharedPreferences mSharedPref = context.getSharedPreferences(SharedPrefConfig.COMMON_INFO, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putInt(ThemeConfig.DARK_THEME, state);
        editor.apply();
    }

    public static int loadNightModeState(Context context) {
        SharedPreferences mSharedPref = context.getSharedPreferences(SharedPrefConfig.COMMON_INFO, Context.MODE_PRIVATE);
        return mSharedPref.getInt(ThemeConfig.DARK_THEME, SharedPrefConfig.NightModeState_LightTheme);
    }

    public static void removeNightModeState(Context context) {
        SharedPreferences mSharedPref = context.getSharedPreferences(SharedPrefConfig.COMMON_INFO, Context.MODE_PRIVATE);
        boolean exists = mSharedPref.contains(ThemeConfig.DARK_THEME);
        if (exists) {
            SharedPreferences.Editor editor = mSharedPref.edit();
            editor.remove(ThemeConfig.DARK_THEME);
            editor.apply();
        }
    }

}
