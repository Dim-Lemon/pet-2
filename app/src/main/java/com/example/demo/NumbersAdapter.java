package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/*
Адаптер для работы с RecycleView во фрагменте
*/


public class NumbersAdapter extends RecyclerView.Adapter<NumbersAdapter.NumberViewHolder> {

    private int numberItems;

    public NumbersAdapter(int numberOfItems){
        numberItems = numberOfItems;
    }


    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.fresh_news_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem, parent, false);
        NumberViewHolder viewHolder = new NumberViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return numberItems;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder{

        ImageView fresh_news_image;
        TextView fresh_news_date;
        TextView fresh_news_text;


        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);

            fresh_news_image = itemView.findViewById(R.id.fresh_news_image_item);
            fresh_news_date = itemView.findViewById(R.id.fresh_news_date_item);
            fresh_news_text = itemView.findViewById(R.id.fresh_news_text_item);
        }
    }


}
