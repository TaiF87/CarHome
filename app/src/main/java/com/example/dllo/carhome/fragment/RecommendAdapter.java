package com.example.dllo.carhome.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.dllo.carhome.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/10/25.
 */
public class RecommendAdapter extends BaseAdapter{
    Context context;
    ArrayList<Recommend> recommends;

    public RecommendAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_recommend,null);
        }

        return null;
    }
    class ViewHolder{
        public ViewHolder(View view) {

        }
    }
}
