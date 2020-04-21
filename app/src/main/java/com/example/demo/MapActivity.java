package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.demo.databinding.ActivityMapBinding;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_map);

        initBinding();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    //****Основные методы****//

    public void initBinding(){
        onClickBtnBackMap();

    }

    //нажатие на кнопку назад
    //1. Нажатие на иконку работает
    //2. Реализован переход на activity_news
    // ***Реализовать в соотвесви с ТЗ
    private void onClickBtnBackMap(){
        binding.btnBackMap.setOnClickListener(v -> openActivityNews());
    }



    //***Вспомогательные методы***//

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    //Метод для перехода на новостную ленту
    private void openActivityNews(){
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }



}
