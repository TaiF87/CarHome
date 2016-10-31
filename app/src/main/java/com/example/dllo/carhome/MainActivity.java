package com.example.dllo.carhome;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.dllo.carhome.base.BaseAty;
import com.example.dllo.carhome.fragmentbutton.brand.ChooseButton;
import com.example.dllo.carhome.fragmentbutton.forum.ForumButton;
import com.example.dllo.carhome.fragmentbutton.recommend.RecommendButton;

public class MainActivity extends BaseAty {

    private RadioButton rbRecommend;
    private RadioButton rbForum;
    private RadioButton rbBrand;
    private RadioButton rbFind;
    private RadioButton rbMe;
    private FragmentManager manager;
    private RadioGroup rgMain;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {

        rbRecommend = bindView(R.id.rb_recommend);
        rbForum = bindView(R.id.rb_forum);
        rbBrand = bindView(R.id.rb_brand);
        rbFind = bindView(R.id.rb_find);
        rbMe = bindView(R.id.rb_me);
        rgMain = (RadioGroup) findViewById(R.id.rg_main);

    }

    @Override
    protected void initData() {
        rbRecommend.setChecked(true);
        manager =  getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl_recommend,new RecommendButton());
        transaction.commit();

        rgMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                FragmentTransaction transaction = manager.beginTransaction();
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.rb_recommend:
                        transaction.replace(R.id.fl_recommend,new RecommendButton());
                        break;
                    case R.id.rb_forum:
                        transaction.replace(R.id.fl_recommend,new ForumButton());
                        break;
                    case R.id.rb_brand:
                        transaction.replace(R.id.fl_recommend,new ChooseButton());
                        break;
                    case R.id.rb_find:
                        break;
                    case R.id.rb_me:
                        break;
                }
                transaction.commit();
            }
        });
    }
//
//    @Override
//    public void onClick(View view) {
//
//
//    }
}
