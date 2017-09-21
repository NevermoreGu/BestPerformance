package com.guqian.BestPerformanceApplication;

import android.os.Bundle;
import android.view.View;

import com.guqian.BestPerformanceApplication.base.BaseActivity;
import com.guqian.BestPerformanceApplication.memory.ObjectPoolsActivity;
import com.guqian.BestPerformanceApplication.utils.ActivityUtils;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initVariables() {

    }

    @Override
    public void initViews(Bundle savedInstanceState) {
    }

    @Override
    public void loadData() {

    }


    @OnClick({R.id.button_memory, R.id.button_thread})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button_memory:
                ActivityUtils.openActivity(this, ObjectPoolsActivity.class);
                break;
            case R.id.button_thread:
                break;
        }
    }

}
