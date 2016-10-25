package com.example.dllo.carhome;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;

import com.example.dllo.carhome.base.BaseAty;
import com.example.dllo.carhome.fragment.CharFragment;
import com.example.dllo.carhome.fragment.CultureFragment;
import com.example.dllo.carhome.fragment.FineFragment;
import com.example.dllo.carhome.fragment.LettersFragment;
import com.example.dllo.carhome.fragment.LobbyistFragment;
import com.example.dllo.carhome.fragment.MarketFragment;
import com.example.dllo.carhome.fragment.ModifiedFragment;
import com.example.dllo.carhome.fragment.NewsFragment;
import com.example.dllo.carhome.fragment.PingceFragment;
import com.example.dllo.carhome.fragment.RecommendFragment;
import com.example.dllo.carhome.fragment.ShoppersFragment;
import com.example.dllo.carhome.fragment.TechnologyFragment;
import com.example.dllo.carhome.fragment.VideoFragment;

import java.util.ArrayList;

public class MainActivity extends BaseAty implements View.OnClickListener {

    private RadioButton rbRecommend;
    private RadioButton rbForum;
    private RadioButton rbBrand;
    private RadioButton rbFind;
    private RadioButton rbMe;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {

        rbRecommend = bindView(R.id.rb_recommend);
        rbForum = bindView(R.id.rb_forum);
        rbBrand = bindView(R.id.rb_brand);
        rbFind = bindView(R.id.rb_find);
        rbMe = bindView(R.id.rb_me);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        setClick(this,rbRecommend,rbForum,rbBrand,rbFind,rbMe);
    }

    @Override
    protected void initData() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl_recommend,new RecommendButton());
        transaction.commit();
    }

    @Override
    public void onClick(View view) {

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        switch (view.getId()){
            case R.id.rb_recommend:
               transaction.replace(R.id.fl_recommend,new RecommendButton());
                transaction.commit();
                break;
            case R.id.rb_forum:
                break;
            case R.id.rb_brand:
                break;
            case R.id.rb_find:
                break;
            case R.id.rb_me:
                break;
        }
    }
}
