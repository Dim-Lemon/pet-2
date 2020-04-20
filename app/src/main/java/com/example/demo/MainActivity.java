package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView)findViewById(R.id.title);




    }




    //нажатие на клавишу забыл пароль
    //1. Нажатие на кнопку работает
    public void OnClick_bth_remind(View v){

    }

    //нажатие на клавишу авторизация
    //1. Нажатие на кнопку работает
    //2. ***Реализовать переход на activity_news в соответсвии с ТЗ
    // Реализован переход на activity_news
    public void OnClick_bth_aut(View v){
        Intent intent = new Intent("com.example.demo.NewsActivity");
        startActivity(intent);
    }
    //нажатие на клавишу авторизация через фб
    //1. Нажатие на кнопку работает
    //2. ***Реализовать переход на activity_news в соответсвии с ТЗ
    public void OnClick_bth_fb_auth(View v){

    }
    //нажатие на клавишу анонимный вход
    //1. Нажатие на кнопку работает
    //2. ***Реализовать переход на activity_news в соответсвии с ТЗ
    public void OnClick_bth_entity(View v){

    }

    //нажатие на клавишу регистрация
    //1. Нажатие на кнопку работает
    //2. ***Реализовать регистрацию в соотвесвии с ТЗ
    public void OnClick_bth_reg(View v){

    }





}




