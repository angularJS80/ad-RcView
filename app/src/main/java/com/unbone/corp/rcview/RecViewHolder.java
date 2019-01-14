package com.unbone.corp.rcview;

import android.support.v7.widget.RecyclerView;
import android.view.View;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class RecViewHolder extends RecyclerView.ViewHolder{
    public TextView textName;
    public TextView textAge;

    public RecViewHolder(View itemView) {
        super(itemView);
        textName = itemView.findViewById(R.id.text_name);
        textAge = itemView.findViewById(R.id.text_age);

    }


}
