package com.guqian.BestPerformanceApplication;

import android.app.Application;
import android.os.StrictMode;

/**
 * Created by guqian on 2017/9/19.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        openStrictMode();
    }

    /**
     * 开启严苛模式
     */
    private void openStrictMode() {
        if (BuildConfig.LOG_DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                    .detectDiskReads()
                    .detectDiskWrites()
                    .detectNetwork()
                    .detectCustomSlowCalls()
                    .penaltyLog()
                    .build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                    .detectLeakedSqlLiteObjects()
                    .detectLeakedClosableObjects()
                    .detectActivityLeaks()
                    .penaltyLog()
                    .penaltyDeath()
                    .build());
        }
    }

}
