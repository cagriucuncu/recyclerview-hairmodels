package com.cagriucuncu.recardview.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.cagriucuncu.recardview.R;
import com.cagriucuncu.recardview.models.HairModel;

import java.util.ArrayList;

public class HairModelAdapter extends RecyclerView.Adapter<HairModelAdapter.ViewHolder>{
    ArrayList<HairModel> mDataset;
    Context mContext;

    public HairModelAdapter(ArrayList<HairModel> mDataset, Context mContext) {
        this.mDataset = mDataset;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View itemView = layoutInflater.inflate(R.layout.hairmodel_list_item, parent, false);
        HairModelAdapter.ViewHolder holder = new ViewHolder(itemView, mContext);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(mDataset.get(position));
    }

    @Override
    public int getItemCount() {        return mDataset.size();    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        LinearLayout hairLayout;
        Context mComtext;
        public ViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            this.mComtext=context;
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
            this.textView = (TextView) itemView.findViewById(R.id.textView);
            this.hairLayout = (LinearLayout) itemView.findViewById(R.id.hairLayout);
        }

        public void bind(HairModel item){
            this.textView.setText(item.getTitle());
            this.hairLayout.setBackgroundColor(item.getColor());
            Glide.with(mComtext)
                    .load(item.getUrl())
                    .into(this.imageView);
        }
    }
}
