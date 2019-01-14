package com.unbone.corp.rcview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    /*화면에 그려넣은 rec_view 와 관계될 변수 */
    RecyclerView recView;
    ArrayList arrayList= new ArrayList();
    RecyclerView.Adapter hashMapAddapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineView();
        defineData();
        defineOther();
        bindData();
    }

    public void defineOther() {
        hashMapAddapter = new HashMapAddapter(arrayList);
    }

    private void bindData() {

        recView.setAdapter(hashMapAddapter);

    }

    private void defineData() {
        HashMap hashMap = new HashMap();
        hashMap.put("name","cho");
        hashMap.put("age","20");

        arrayList.add(hashMap);

        HashMap hashMap1 = new HashMap();
        hashMap1.put("name","cho");
        hashMap1.put("age","30");

        arrayList.add(hashMap1);

    }

    private void defineView() {
        recView = findViewById(R.id.rec_view);
    }





}
