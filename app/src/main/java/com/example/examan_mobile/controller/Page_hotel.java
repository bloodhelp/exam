package com.example.examan_mobile.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.examan_mobile.R;
import com.example.examan_mobile.adapter.Adapter_hotel;
import com.example.examan_mobile.model.hotel;
import com.example.examan_mobile.model.hotel_click;

import java.util.ArrayList;

public class Page_hotel extends AppCompatActivity implements hotel_click {

    RecyclerView rec;
    Adapter_hotel adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_hotel);

        rec =findViewById(R.id.recycleview_hotel);
        ArrayList<hotel> list_hotel;
        list_hotel = new ArrayList<>();
        list_hotel.add(new hotel("hotel1",
                "cevzeezvze" ,new String[]{"2.2945" ,"48.8584"},
                "cdscdscdscdsvd"));
        list_hotel.add(new hotel("hotel2",
                "cevzeezvze" ,new String[]{"2.2945" ,"48.8584"},
                "fefvdsvdvdsze"));
        list_hotel.add(new hotel("hotel3",
                "cevzeevdsvdsvsdzvze" ,new String[]{"2.2945" ,"48.8584"},
                "fefze"));

                list_hotel.add(new hotel("hotel>4",
                "cevzeezvze" ,new String[]{"2.2945" ,"48.8584"},
                "cdscdscdscdsvd"));        list_hotel.add(new hotel("vdsvdsvdsvsd",
                "cevzeezvze" ,new String[]{"2.2945" ,"48.8584"},
                "fefvdsvdvdsze"));        list_hotel.add(new hotel("vdsvdsvdsvsdv",
                "cevzeevdsvdsvsdzvze" ,new String[]{"2.2945" ,"48.8584"},
                "fefze"));

        adapter = new Adapter_hotel(list_hotel, this);
        rec.setAdapter(adapter);
        GridLayoutManager grid = new GridLayoutManager(this , 1,GridLayoutManager.VERTICAL,false);
        rec.setLayoutManager(grid);
    }

    @Override
    public void centre_onclick_(int pos) {
        Intent it = new Intent(Page_hotel.this , Controller_Page_map.class);
        startActivity(it);
    }
}