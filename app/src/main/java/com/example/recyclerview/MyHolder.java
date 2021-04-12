package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView m1maeView;
    TextView mTitle, mDes;
    ItemClickListener itemClickListener;

    MyHolder(@NonNull View itemView){
        super(itemView);

        this.m1maeView = itemView.findViewById(R.id.imageIv);
        this.mTitle = itemView.findViewById(R.id.titleTV);
        this.mDes = itemView.findViewById(R.id.descriptionTV);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        this.itemClickListener.onItemClickListener(v, getLayoutPosition());

    }

    public void setItemClickListener(ItemClickListener ic){

        this.itemClickListener = ic;

    }

}
