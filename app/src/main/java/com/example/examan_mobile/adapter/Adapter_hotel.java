package com.example.examan_mobile.adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examan_mobile.R;
import com.example.examan_mobile.model.hotel;
import com.example.examan_mobile.model.hotel_click;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter_hotel extends RecyclerView.Adapter<Adapter_hotel.ViewHolder>{

    ArrayList<hotel> list_centre;
    hotel_click item_click;
    public Adapter_hotel(ArrayList<hotel> list_centre ,hotel_click item_click ) {
        this.list_centre = list_centre;
        this.item_click = item_click;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        View v = inflate.inflate(R.layout.item_hotel   , parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        Picasso.get().load(list_centre.get(position).getImage_hotel()).into(holder.img);
        holder.txt_nom.setText(list_centre.get(position).getNom());
        holder.txt_des.setText(list_centre.get(position).getDescription());
        holder.txt_des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
            }
        });

    }
    @Override
    public int getItemCount() {
        return list_centre.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;

        TextView txt_nom;
        TextView txt_des;
        TextView txt_map;
        LinearLayout item_hotel;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //imageView
            img =itemView.findViewById(R.id.img);
            txt_nom =itemView.findViewById(R.id.txt_nom);
            txt_nom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    item_click.centre_onclick_(getAdapterPosition());
                }
            });
            txt_des =itemView.findViewById(R.id.txt_des);
            txt_des.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    item_click.centre_onclick_(getAdapterPosition());
                }
            });
            txt_map.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    item_click.centre_onclick_(getAdapterPosition());
                }
            });
            txt_map =itemView.findViewById(R.id.txt_map);
            item_hotel =itemView.findViewById(R.id.item_hotel);
            item_hotel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    item_click.centre_onclick_(getAdapterPosition());
                }
            });
        }
    }
}














