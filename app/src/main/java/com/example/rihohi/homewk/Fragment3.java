package com.example.rihohi.homewk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragment3 extends Fragment {
    private List<OrderMenu> orMenulist=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment3,container,false);
        initMenu();
        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.recy_menu);
        LinearLayoutManager layoutManager=new LinearLayoutManager(MyApplication.getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        OrderSelect adapter=new OrderSelect(orMenulist);
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void initMenu(){
        for (int i=0;i<4;i++){
            orMenulist.add(new OrderMenu(R.mipmap.ic_launcher,"代付款"));
        }
    }
}