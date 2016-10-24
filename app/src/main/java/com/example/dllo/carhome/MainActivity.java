package com.example.dllo.carhome;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
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

public class MainActivity extends BaseAty {

    private TabLayout mainTb;
    private ViewPager mainVp;
    private ArrayList<Fragment> fragments;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        FrameLayout flRecommend = bindView(R.id.fl_recommend);
        RadioButton rbRecommend = bindView(R.id.rb_recommend);
        RadioButton rbForum = bindView(R.id.rb_forum);
        RadioButton rbBrand = bindView(R.id.rb_brand);
        RadioButton rbFind = bindView(R.id.rb_find);
        RadioButton rbMe = bindView(R.id.rb_me);
//        mainTb = bindView(R.id.tb_main);
//        mainVp = bindView(R.id.vp_main);
//
//        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
//        adapter.setFragments(fragments);
//        mainVp.setAdapter(adapter);
//        mainTb.setupWithViewPager(mainVp);

    }

    @Override
    protected void initData() {
       //initFragment();

    }
//    private void initFragment(){
//        fragments = new ArrayList<>();
//        fragments.add(new RecommendFragment());
//        fragments.add(new FineFragment());
//        fragments.add(new LobbyistFragment());
//        fragments.add(new VideoFragment());
//        fragments.add(new LettersFragment());
//        fragments.add(new MarketFragment());
//        fragments.add(new NewsFragment());
//        fragments.add(new PingceFragment());
//        fragments.add(new ShoppersFragment());
//        fragments.add(new CharFragment());
//        fragments.add(new TechnologyFragment());
//        fragments.add(new CultureFragment());
//        fragments.add(new ModifiedFragment());
//    }
//    private void initTabs(){
//        int[] selectors = {
//
//        };
//    }
}
