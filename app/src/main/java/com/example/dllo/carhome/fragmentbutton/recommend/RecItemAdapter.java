package com.example.dllo.carhome.fragmentbutton.recommend;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.carhome.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/10/25.
 */
public class RecItemAdapter extends RecyclerView.Adapter{
    Context context;
    ArrayList<String> arrayList;
    ArrayList<RecommendItem> recommendItems;
    public RecItemAdapter(Context context) {
        this.context = context;
    }

    public void setRecommendItems(ArrayList<RecommendItem> recommendItems) {
        this.recommendItems = recommendItems;
        notifyDataSetChanged();
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(context).inflate(R.layout.item_recommend,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
//        myViewHolder.tvData.setText(recommendItems.get(position).getDate());
//        myViewHolder.tvCaption.setText(recommendItems.get(position).getDate());
//        myViewHolder.tvReply.setText(recommendItems.get(position).getDate());
//        myViewHolder.ivPic.setImageResource(R.mipmap.ic_launcher);
        myViewHolder.tvReply.setText(arrayList.get(position));


    }

    @Override
    public int getItemCount() {
//        return recommendItems == null ? 0 : recommendItems.size();
        return arrayList == null ? 0 : arrayList.size();
    }

    class  MyViewHolder extends RecyclerView.ViewHolder{

        private final TextView tvData;
        private final TextView tvCaption;
        private final TextView tvReply;
//        private final ImageView ivPic;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvData = (TextView) itemView.findViewById(R.id.data_item);
            tvCaption = (TextView) itemView.findViewById(R.id.caption_item);
            tvReply = (TextView) itemView.findViewById(R.id.reply_item);
//            ivPic = (ImageView) itemView.findViewById(R.id.iv_carousel);
        }
    }
}
