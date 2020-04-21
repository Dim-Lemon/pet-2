package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.demo.databinding.ActivityNewsBinding;


public class NewsActivity extends AppCompatActivity {

    private ActivityNewsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //todo new
        binding = DataBindingUtil.setContentView(this, R.layout.activity_news);

        initBinding();

    }

    //****Основные методы****//

    private void initBinding() {
        //нажатие на иконку карты
        //1. Нажатие на иконку работает
        //2. Реализован переход на activity_map
        // ***Реализовать в соотвесви с ТЗ
        binding.btnMapNews.setOnClickListener(view -> openMapActivity());

        //нажатие на иконку меню
        //1.
        //2.
        // ***Реализовать в соотвесви с ТЗ
        //

        //нажатие на кнопку свежее
        //1. Нажатие на кнопку работает
        //2. Реализована реакция на выбор кнопки свежее / горячее
        // ***Реализовать в соотвесви с ТЗ
        binding.btnFreshNews.setOnClickListener(v -> Select_btn(true));

        //нажатие на кнопку горячее
        //1. Нажатие на кнопку работает
        //2. Реализована реакция на выбор кнопки свежее / горячее
        // ***Реализовать в соотвесви с ТЗ
        binding.btnHotNews.setOnClickListener(v -> Select_btn(false));

    }






    //***Вспомогательные методы***//

    //метод для реализации на нажатие свежее/горячеее
    private void Select_btn(boolean select_btn) {
        if (select_btn) {
            //нажате на свежее

            binding.freshSelectLineNews.setVisibility(View.VISIBLE);
            binding.hotSelectLineNews.setVisibility(View.INVISIBLE);
            binding.btnFreshNews.setTypeface(null, Typeface.BOLD);
            binding.btnHotNews.setTypeface(null, Typeface.NORMAL);

        } else {
            //нажатие на горячее

            binding.freshSelectLineNews.setVisibility(View.INVISIBLE);
            binding.hotSelectLineNews.setVisibility(View.VISIBLE);
            binding.btnFreshNews.setTypeface(null, Typeface.NORMAL);
            binding.btnHotNews.setTypeface(null, Typeface.BOLD);

        }
    }

    //метод перехода на активти карты
    private void openMapActivity() {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

//НЕ ТРОГАТЬ
}
