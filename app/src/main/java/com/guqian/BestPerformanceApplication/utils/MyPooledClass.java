package com.guqian.BestPerformanceApplication.utils;

import android.support.v4.util.Pools;

/**
 * Created by guqian on 2017/9/21.
 */

public class MyPooledClass {

    private static final Pools.SynchronizedPool<MyPooledClass> sPool =
            new Pools.SynchronizedPool(10);

    public static MyPooledClass obtain() {
        MyPooledClass instance = sPool.acquire();
        return (instance != null) ? instance : new MyPooledClass();
    }

    public void recycle() {
        // Clear state if needed.
        sPool.release(this);
    }

}
