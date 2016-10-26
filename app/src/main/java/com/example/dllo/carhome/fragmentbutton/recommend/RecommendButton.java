package com.example.dllo.carhome.fragmentbutton.recommend;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.carhome.MyAdapter;
import com.example.dllo.carhome.R;
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

/**
 * Created by dllo on 16/10/25.
 */
public class RecommendButton extends Fragment {
    private TabLayout mainTb;
    private ViewPager mainVp;
    private ArrayList<Fragment> fragments;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recommend_button,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mainTb = (TabLayout) view.findViewById(R.id.tb_main);
        mainVp = (ViewPager) view.findViewById(R.id.vp_main);

        fragments = new ArrayList<>();
        fragments.add(new RecommendFragment());
        fragments.add(new FineFragment());
        fragments.add(new LobbyistFragment());
        fragments.add(new VideoFragment());
        fragments.add(new LettersFragment());
        fragments.add(new MarketFragment());
        fragments.add(new NewsFragment());
        fragments.add(new PingceFragment());
        fragments.add(new ShoppersFragment());
        fragments.add(new CharFragment());
        fragments.add(new TechnologyFragment());
        fragments.add(new CultureFragment());
        fragments.add(new ModifiedFragment());

        MyAdapter adapter = new MyAdapter(getFragmentManager());
        adapter.setFragments(fragments);
        mainVp.setAdapter(adapter);
        mainTb.setupWithViewPager(mainVp);
        mainTb.setTabMode(TabLayout.MODE_SCROLLABLE);
        mainTb.setSelectedTabIndicatorColor(Color.BLACK);
    }
}
