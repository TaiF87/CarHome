package com.example.dllo.carhome.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;
import com.example.dllo.carhome.R;
import com.example.dllo.carhome.fragmentbutton.recommend.PicAdapter;
import com.example.dllo.carhome.fragmentbutton.recommend.Point;
import com.example.dllo.carhome.fragmentbutton.recommend.RecItemAdapter;
import com.example.dllo.carhome.fragmentbutton.recommend.RecommendItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/10/24.
 */
public class RecommendFragment extends Fragment {


    private ImageView ivCarousel;
    private ViewPager vpCarousel;
    private RecyclerViewHeader recyclerViewHeader;
    private RecyclerView recyclerView;
    private ArrayList<RecommendItem> recommendItems;
    private List<Point> points;
    private String [] pics = {"http://pic29.nipic.com/20130506/3822951_102005116000_2.jpg",
            "http://pic36.nipic.com/20131125/8821914_090743677000_2.jpg",
            "http://img.boqiicdn.com/Data/BK/A/1411/26/img77931416972193.jpg"
    ,"http://pic36.nipic.com/20131125/8821914_090743677000_2.jpg",
            "http://img.boqiicdn.com/Data/BK/A/1411/26/img77931416972193.jpg"
    };
    ArrayList<String> bean;
    private Handler handler;
    private PicAdapter picAdapter;
    private LinearLayout linearLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recommend_fragment,null);
    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        vpCarousel = (ViewPager) view.findViewById(R.id.vp_carousel);
        linearLayout = (LinearLayout) view.findViewById(R.id.ll_point);
        picAdapter = new PicAdapter();
        picAdapter.setUrl(pics);
        vpCarousel.setAdapter(picAdapter);
        initPoints();

        handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if (vpCarousel != null && msg.what == 1){
                    int num = vpCarousel.getCurrentItem();
                    vpCarousel.setCurrentItem(num + 1);
                }
                handler.sendEmptyMessageDelayed(1,2000);
            }
        };
        vpCarousel.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                int currentPage = position % picAdapter.getImagCount();
                for (Point point : points){
                    point.setSelected(false);
                }
                points.get(currentPage).setSelected(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        vpCarousel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "adf", Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView = (RecyclerView) view.findViewById(R.id.rv_recommend);

        recyclerViewHeader = (RecyclerViewHeader) view.findViewById(R.id.rvh_recommend);
//        vpCarousel = (ViewPager) view.findViewById(R.id.vp_carousel);
        // ivCarousel = (ImageView) view.findViewById(R.id.iv_carousel);
        bean = new ArrayList<>();


        recommendItems = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            bean.add("我是" + i);
        }

        RecItemAdapter itemAdapter = new RecItemAdapter(getActivity());
        itemAdapter.setArrayList(bean);

        GridLayoutManager manager = new GridLayoutManager(getContext(),1);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(itemAdapter);
        recyclerViewHeader.attachTo(recyclerView,true);

    }

    private void initPoints() {
        points = new ArrayList<>();
        for (int i = 0; i < picAdapter.getImagCount() ; i++) {
            Point point = new Point(getContext());
            points.add(point);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(60,20);
            linearLayout.addView(point,layoutParams);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        handler.sendEmptyMessageAtTime(1,2000);
    }

    @Override
    public void onStop() {
        super.onStop();
        handler.removeMessages(1);
    }
}
