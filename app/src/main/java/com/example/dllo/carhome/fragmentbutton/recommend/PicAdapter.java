package com.example.dllo.carhome.fragmentbutton.recommend;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Created by dllo on 16/10/29.
 */
public class PicAdapter extends PagerAdapter{
    String[] url ;

    public void setUrl(String[] url) {
        this.url = url;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return url == null ? 0 : Integer.MAX_VALUE;
    }

    public int getImagCount(){
        return url.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(container.getContext());
        Picasso.with(container.getContext()).load(url[position % url.length]).fit().into(imageView);
        container.addView(imageView, ViewPager.LayoutParams.MATCH_PARENT,
                ViewPager.LayoutParams.MATCH_PARENT);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        if (container.getChildAt(position) == object) {
            container.removeViewAt(position);
        }
    }

}
