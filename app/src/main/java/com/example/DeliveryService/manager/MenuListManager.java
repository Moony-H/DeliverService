package com.example.DeliveryService.manager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridLayout;

import com.example.DeliveryService.R;

public class MenuListManager {
    public void addList(Context context, GridLayout gridLayout){
        LayoutInflater mLayoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view= LayoutInflater.from(context).inflate(R.layout.menu_list_item,);
        mLayoutInflater.inflate(R.layout.menu_list_item,gridLayout,true);

    }

}
