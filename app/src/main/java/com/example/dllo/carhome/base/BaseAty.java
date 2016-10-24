package com.example.dllo.carhome.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by dllo on 16/10/21.
 */
public abstract class BaseAty extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayout());
        initViews();
        initData();
    }

    protected abstract int getLayout();
    protected abstract void initViews();
    protected abstract void initData();
    protected  <T extends View> T bindView(int id){
        return (T) findViewById(id);
    }
}
