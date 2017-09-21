package com.guqian.BestPerformanceApplication.memory;

import android.os.Bundle;
import android.view.View;

import com.guqian.BestPerformanceApplication.R;
import com.guqian.BestPerformanceApplication.base.BaseActivity;
import com.guqian.BestPerformanceApplication.utils.ActivityUtils;

import butterknife.OnClick;

public class MemoryActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_memory;
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

    @OnClick({R.id.button_object_pool, R.id.button_lru_cache})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button_object_pool:
                ActivityUtils.openActivity(this,ObjectPoolsActivity.class);
                break;
            case R.id.button_lru_cache:
                break;
        }
    }
}
