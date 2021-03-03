package com.example.DeliveryService.manager;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.DeliveryService.R;
import com.example.DeliveryService.activity.MenuActivity;
import com.example.DeliveryService.data.MainGridItem;

import java.util.ArrayList;

public class MainGridAdapter extends RecyclerView.Adapter<MainGridAdapter.ViewHolder> {


    ArrayList<MainGridItem> menus;

    public MainGridAdapter(ArrayList<MainGridItem> menus){
        this.menus=menus;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //아이템 레이아웃을 확장.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_grid_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image.setImageResource(menus.get(position).image);
        holder.text.setText(menus.get(position).name);
        holder.menuTag=menus.get(position).tag;
        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), MenuActivity.class);
                intent.putExtra("menuTag",holder.menuTag);
            }
        });


    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView text;
        int menuTag;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.image=itemView.findViewById(R.id.main_grid_item_image);
            this.text=itemView.findViewById(R.id.main_grid_item_text);
        }
    }
}
