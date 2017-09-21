package com.guqian.BestPerformanceApplication.memory;

import android.os.Bundle;
import android.view.View;

import com.guqian.BestPerformanceApplication.R;
import com.guqian.BestPerformanceApplication.base.BaseActivity;
import com.guqian.BestPerformanceApplication.utils.MyPooledClass;

import butterknife.OnClick;

/**
 * Created by guqian on 2017/9/19.
 *
 * 构建大量对象时，使用线程池，通过 android monitor 内存查看三个方法的内存对比
 */

public class ObjectPoolsActivity extends BaseActivity {

    private static final int SIZE = 10000;

    @Override
    public void initVariables() {
    }

    @Override
    public void initViews(Bundle savedInstanceState) {

    }

    @Override
    public void loadData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_object_pools;
    }

    @OnClick({R.id.button_foreach_in, R.id.button_foreach_out, R.id.button_object_pool})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button_foreach_in:
                foreachIn();
                break;
            case R.id.button_foreach_out:
                foreachOut();
                break;
            case R.id.button_object_pool:
                createObjectPool();
                break;
        }
    }

    private void foreachIn() {

        for (int i = 0; i < SIZE; i++) {
            MyPooledClass myPooledClass = new MyPooledClass();
        }
    }

    private void foreachOut() {
        MyPooledClass myPooledClass;
        for (int i = 0; i < SIZE; i++) {
            myPooledClass = new MyPooledClass();

        }
    }

    private void createObjectPool() {
        for (int i = 0; i < SIZE; i++) {
            MyPooledClass myPooledClass = MyPooledClass.obtain();
            myPooledClass.recycle();
        }
    }


}
