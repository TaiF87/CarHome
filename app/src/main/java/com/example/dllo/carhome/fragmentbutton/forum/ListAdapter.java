package com.example.dllo.carhome.fragmentbutton.forum;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.dllo.carhome.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/10/27.
 */
public class ListAdapter extends BaseAdapter {
    Context context;
    ArrayList<ListElement> elements;

    public ListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return elements == null ? 0 : elements.size();
    }

    @Override
    public Object getItem(int i) {
        return elements.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_forun,null);

        }
        return null;
    }

    private class ViewHolder {
        public ViewHolder(View view) {

        }
    }
}
