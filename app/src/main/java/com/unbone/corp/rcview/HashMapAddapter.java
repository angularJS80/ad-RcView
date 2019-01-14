package com.unbone.corp.rcview;

import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by yongbeom on 2018. 12. 27..
 */

class HashMapAddapter extends android.support.v7.widget.RecyclerView.Adapter<RecViewHolder> {
    ArrayList arrayList;
    Context viewContext;
    public HashMapAddapter(ArrayList arrayList) {
        this.arrayList =  arrayList;
    }

    /*홀더가 생성 될 때 수행 되는 메소드 */
    /*홀더는 언제 생성이 되는지 ? 데어터가 있어야 홀더생성이 수행 된다.*/
    /* HashMapAddapter 입장에서 데이터가 있는지는 ? getItemCount 가 1보다 높을때 */
    @Override
    public RecViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        System.out.println(((android.support.v7.widget.RecyclerView)parent).getWidth());
        this.viewContext = parent.getContext();
        View itmeView = LayoutInflater.from(this.viewContext).inflate(R.layout.text_item ,parent,false);
        RecViewHolder viewHolder = new RecViewHolder(itmeView);
        return viewHolder;
    }

    /*데이터가 홀더에 바인딩 될때 수행 되는 메소드 */
    @Override
    public void onBindViewHolder(RecViewHolder holder, int position) {
        HashMap item = (HashMap) arrayList.get(position);





        holder.textAge.setText(item.get("age").toString());


    }

    /*현재 어뎁터에서 사용중인 데이터 행의 갯수 */
    @Override
    public int getItemCount() {
        return  arrayList.size();
    }

}
