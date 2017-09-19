package com.guqian.BestPerformanceApplication;

import android.os.StrictMode;
import android.support.multidex.MultiDexApplication;

/**
 * Created by guqian on 2017/9/19.
 */

public class MyApplication extends MultiDexApplication {

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
