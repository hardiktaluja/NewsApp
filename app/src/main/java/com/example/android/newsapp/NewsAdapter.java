package com.example.android.newsapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    private static final String DATE_SEPARATOR = "T";

    public NewsAdapter(Activity context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView sectionTextView = listItemView.findViewById(R.id.section);
        sectionTextView.setText(currentNews.getSection());

        TextView titleTextView = listItemView.findViewById(R.id.title);
        titleTextView.setText(currentNews.getTitle());

        TextView authorTextView = listItemView.findViewById(R.id.author);
        authorTextView.setText(currentNews.getAuthor());

        TextView dateTextView = listItemView.findViewById(R.id.date);
        String dateTime = currentNews.getDate();
        String[] parts = dateTime.split(DATE_SEPARATOR);
        dateTextView.setText(parts[0]);

        return listItemView;
    }
}
