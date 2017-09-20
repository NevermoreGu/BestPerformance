package com.guqian.BestPerformanceApplication.interf;

import android.os.Bundle;

public interface BaseViewInterface {

    /**
     * 初始化变量
     */
    void initVariables();

    /**
     * 初始化view
     */
    void initViews(Bundle savedInstanceState);

    /**
     * 加载数据
     */
    void loadData();

}
