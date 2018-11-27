package com.example.rihohi.homewk;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class OrderSelect extends RecyclerView.Adapter<OrderSelect.ViewHolder>{
    private List<OrderMenu> mordermenulist;

    static class ViewHolder extends RecyclerView.ViewHolder{
        Button orderButton;
        TextView orderTextview;

        public ViewHolder(View view){
            super(view);
            orderButton=(Button)view.findViewById(R.id.daifukuan);
            orderTextview=(TextView)view.findViewById(R.id.textdaifukuan);
        }
    }

    public OrderSelect(List<OrderMenu> orderMenus){
        mordermenulist=orderMenus;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//        OrderMenu orderMenu=mordermenulist.get(position);
//        ((ViewHolder) holder).orderTextview.setText(orderMenu.orderName);
//        ((ViewHolder) holder).orderButton.setText("5555");
    }

    @Override
    public int getItemCount() {
        return mordermenulist.size();
    }
}
