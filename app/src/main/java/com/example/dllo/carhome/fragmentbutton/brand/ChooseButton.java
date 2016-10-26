package com.example.dllo.carhome.fragmentbutton.brand;

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
public class ChooseButton extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.choose_button,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TabLayout tbChoose = (TabLayout) view.findViewById(R.id.tb_choose);
        ViewPager vpChoose = (ViewPager) view.findViewById(R.id.vp_choose);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new NewCarFragment());
        fragments.add(new OldCarFragment());

        ChooseAdapter chooseAdapter = new ChooseAdapter(getFragmentManager());
        chooseAdapter.setFragments(fragments);
        vpChoose.setAdapter(chooseAdapter);
        tbChoose.setupWithViewPager(vpChoose);
    }
}
