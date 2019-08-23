package com.example.meatit.Util;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.meatit.Config.SharedPrefConfig;
import com.example.meatit.Config.ThemeConfig;

public class NightModeSharedPrefUtil {

    public NightModeSharedPrefUtil() {
//        this.mSharedPref = context.getSharedPreferences("CommonInfo", Context.MODE_PRIVATE);
    }

    public static void setNightModeState(Context context, Boolean state) {
        SharedPreferences mSharedPref = context.getSharedPreferences(SharedPrefConfig.COMMOM_INFO, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(ThemeConfig.DARK_THEME, state);
        editor.apply();
    }

    public static Boolean loadNightModeState(Context context) {
        SharedPreferences mSharedPref = context.getSharedPreferences(SharedPrefConfig.COMMOM_INFO, Context.MODE_PRIVATE);
        return mSharedPref.getBoolean(ThemeConfig.DARK_THEME, false);
    }

}
