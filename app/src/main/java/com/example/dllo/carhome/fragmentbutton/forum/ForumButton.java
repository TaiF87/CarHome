package com.example.dllo.carhome.fragmentbutton.forum;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.carhome.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/10/26.
 */
public class ForumButton extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.forum_button,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TabLayout tbForum = (TabLayout) view.findViewById(R.id.tb_forum);
        ViewPager vpForum = (ViewPager) view.findViewById(R.id.vp_forum);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new SelectFragment());
        fragments.add(new ForumFragment());

        ForumAdapter forumAdapter = new ForumAdapter(getChildFragmentManager());
        forumAdapter.setFragments(fragments);
        vpForum.setAdapter(forumAdapter);
        tbForum.setupWithViewPager(vpForum);
        tbForum.setSelectedTabIndicatorColor(Color.BLACK);
    }
}
