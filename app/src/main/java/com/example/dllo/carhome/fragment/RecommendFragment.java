package com.example.dllo.carhome.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.dllo.carhome.MyAdapter;
import com.example.dllo.carhome.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/10/24.
 */
public class RecommendFragment extends android.support.v4.app.Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recommend_fragment,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ListView lvRecommend = (ListView) view.findViewById(R.id.lv_recommend);

        RecommendAdapter redAdapter = new RecommendAdapter(getActivity());

    }

}
