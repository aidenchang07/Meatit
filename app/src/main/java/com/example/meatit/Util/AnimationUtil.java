package com.example.meatit.Util;

import android.app.Activity;

import com.example.meatit.R;

/**
 * Created by AidenChang 2019/09/02
 */
public class AnimationUtil {

    public AnimationUtil() {
    }

    public void reCreateByAnimation(Activity activity) {
        // Restart the activity with animation
        activity.finish();
        activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        activity.startActivity(activity.getIntent());
    }
}
