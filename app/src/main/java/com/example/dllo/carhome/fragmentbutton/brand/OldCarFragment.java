package com.example.dllo.carhome.fragmentbutton.brand;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.carhome.R;

/**
 * Created by dllo on 16/10/26.
 */
public class OldCarFragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.oldcar_fragment,container,false);
    }
}
