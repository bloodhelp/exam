package com.example.examan_mobile.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.examan_mobile.Controller_Page_surface;
import com.example.examan_mobile.R;

public class Controller_Page_homme extends AppCompatActivity {

    CardView item1_hotel;
    CardView item2_parc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_homme);

        item1_hotel =findViewById(R.id.item1_hotel);
        item1_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Controller_Page_homme.this ,
                        Page_hotel.class);
                startActivity(it);
            }
        });
        item2_parc =findViewById(R.id.item2_parc);
        item2_parc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Controller_Page_homme.this ,
                        Controller_Page_parc.class);
                startActivity(it);
            }
        });



    }
}