package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private TextView title;

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        initBinding();

    }

    //****Основные методы****//

    private void initBinding(){
        setClickBtnAuthMain();
    }

    //нажатие на клавишу забыл пароль
    //1. Нажатие на кнопку работает
    //2. Реализован переход на activity_news
    // *** Реализовать по ТЗ
    private void setClickBtnAuthMain(){
        binding.btnAuthMain.setOnClickListener(view -> openActivityNews());
    }

    //Метод для перехода на новостную ленту
    private void openActivityNews(){
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }










    /*


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


*/


}




