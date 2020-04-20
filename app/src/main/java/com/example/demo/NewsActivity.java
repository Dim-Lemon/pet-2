package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NavUtils;


import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NewsActivity extends AppCompatActivity {
    //Заголовок НОВОСТЬ, кнопка свежее, кнопка горячее
    private TextView news_text_view, btn_fresh_news, btn_hot_news;

    //линии под кнопкой свежее, горячее
    private View fresh_select_line, hot_select_line;

    ConstraintLayout activity_news_constraint_layout;
    private Color color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        news_text_view = (TextView)findViewById(R.id.news_text_view);
        btn_fresh_news = (TextView)findViewById(R.id.btn_fresh_news);
        btn_hot_news = (TextView)findViewById(R.id.btn_hot_news);
        fresh_select_line = (View)findViewById(R.id.fresh_select_line);
        hot_select_line = (View)findViewById(R.id.hot_select_line);

    //НЕ ТРОГАТЬ
    }



    //нажатие на иконку карты
    //1. Нажатие на иконку работает
    //2.
    // ***Реализовать в соотвесви с ТЗ
    public void OnClick_btn_menu_news(View v){


    }

    //нажатие на иконку меню
    //1. Нажатие на иконку работает
    //2. ***Реализовать в соотвесви с ТЗ
    public void OnClick_btn_map_news(View v){


    }

    //нажатие на кнопку свежее
    //1. Нажатие на кнопку работает
    //2. Реализована реакция на выбор кнопки свежее / горячее
    // ***Реализовать в соотвесви с ТЗ
    public void OnClick_btn_fresh_news(View v){
        //реакция на нажатие кнопки Свежее
        Select_btn(btn_fresh_news);

    }

    //нажатие на кнопку горячее
    //1. Нажатие на кнопку работает
    //2. Реализована реакция на выбор кнопки свежее / горячее
    // ***Реализовать в соотвесви с ТЗ

    public void OnClick_btn_hot_news(View v){
        //реакция на нажатие кнопки Горячее
        Select_btn(btn_hot_news);

    }

    //метод для реализации на нажатие свежее/горячеее
    private void Select_btn(TextView select_btn_news){
        if (select_btn_news == btn_fresh_news) {
            //нажате на свежее
            fresh_select_line.setBackgroundColor(Color.parseColor("#ED1E3C"));
            hot_select_line.setBackgroundColor(Color.parseColor("#FFFFFF"));
            btn_fresh_news.setTypeface(null, Typeface.BOLD);
            btn_hot_news.setTypeface(null, Typeface.NORMAL);
        }
        else {
            //нажатие на горячее
            fresh_select_line.setBackgroundColor(Color.parseColor("#FFFFFF"));
            hot_select_line.setBackgroundColor(Color.parseColor("#ED1E3C"));
            btn_fresh_news.setTypeface(null, Typeface.NORMAL);
            btn_hot_news.setTypeface(null, Typeface.BOLD);
        }

    }

















//НЕ ТРОГАТЬ
}
