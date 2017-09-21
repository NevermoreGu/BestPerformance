package com.guqian.BestPerformanceApplication.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by guqian on 2017/9/20.
 */

public class ActivityUtils {

    /**
     * 通过包名类名启动activity
     *
     * @param activity
     * @param activityClass
     */
    public static void openActivity(Activity activity, Class<?> activityClass) {
        openActivity(activity, activityClass, null);
    }

    public static void openActivity(Activity activity, Class<?> activityClass, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(activity, activityClass);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }

    public static void openActivityForResult(Activity activity, Class<?> activityClass, int requestCode) {
        Intent intent = new Intent();
        intent.setClass(activity, activityClass);
        activity.startActivityForResult(intent, requestCode);
    }
}
