package com.example.demo;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FreshNewsFragment extends Fragment {

    private NumbersAdapter numbersAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        //создаем менеджер для отображения элементов списка
        View view = inflater.inflate(R.layout.fragment_fresh_news, container, false);
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.Recycler_view_fresh_news);


        //разметка для recyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        //адаптер для recyclerView
        numbersAdapter = new NumbersAdapter(10);
        recyclerView.setAdapter(numbersAdapter);



        //конец
        return view;
    }
}
