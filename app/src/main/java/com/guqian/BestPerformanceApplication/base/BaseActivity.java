package com.guqian.BestPerformanceApplication.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.guqian.BestPerformanceApplication.interf.BaseViewInterface;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity implements BaseViewInterface {

    protected final String TAG = this.getClass().getSimpleName();

    protected LayoutInflater mInflater;

    protected void onBeforeSetContentLayout() {
    }

    protected abstract int getLayoutId();

    protected View inflateView(int resId) {
        return mInflater.inflate(resId, null);
    }

    /**
     * 处理从上一个界面接收的intent,或singleTop,singleTask,singleInstance onNewIntent中intent
     */
    protected void handlerIntent() {
    }

    protected List<ImageView> imageViews = new ArrayList<>();

    protected Activity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onBeforeSetContentLayout();
        if (getLayoutId() != 0) {
            setContentView(getLayoutId());
        }
        ButterKnife.bind(this);
        mContext = this;
        mInflater = getLayoutInflater();
        handlerIntent();
        initVariables();
        initViews(savedInstanceState);
        loadData();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        //必须设置setIntent
        setIntent(intent);
        handlerIntent();
    }
}
