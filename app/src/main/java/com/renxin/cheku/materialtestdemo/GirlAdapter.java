package com.renxin.cheku.materialtestdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created on 2017/8/25.
 * Function:
 *
 * @author Zhipeng.Fan
 */

public class GirlAdapter extends RecyclerView.Adapter<GirlAdapter.ViewHolder> {

    private List<Girl> mGirls;

    private Context mContext;

    public GirlAdapter(List<Girl> girls) {
        mGirls = girls;
    }

    @Override
    public GirlAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mContext == null) {
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_view, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, GirlActivity.class);
                mContext.startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(GirlAdapter.ViewHolder holder, int position) {
        Girl girl = mGirls.get(position);
        holder.mTextView.setText(girl.getName());
        Glide.with(mContext).load(girl.getImg()).into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mGirls.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        CardView mCardView;
        ImageView mImageView;
        TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mCardView = (CardView) itemView.findViewById(R.id.card_view);
            mImageView = (ImageView) itemView.findViewById(R.id.image);
            mTextView = (TextView) itemView.findViewById(R.id.text);
        }
    }
}
