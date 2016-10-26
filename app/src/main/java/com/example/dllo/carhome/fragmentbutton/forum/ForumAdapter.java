package com.example.dllo.carhome.fragmentbutton.forum;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/10/26.
 */
public class ForumAdapter extends FragmentPagerAdapter{
    String[] title = {"精选","论坛"};
    ArrayList<Fragment> fragments;

    public void setFragments(ArrayList<Fragment> fragments) {
        this.fragments = fragments;
    }

    public ForumAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments == null ? 0 : fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
