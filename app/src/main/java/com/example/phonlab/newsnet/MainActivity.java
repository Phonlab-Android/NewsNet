package com.example.phonlab.newsnet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> articles;
    ListView articlesList;

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        articles = new ArrayList<>();
        articlesList = findViewById(R.id.article_list);

        articles.add("article #1");
        articles.add("article #2");
        articles.add("article #3");
        articles.add("article #4");
        articles.add("article #5");
        articles.add("article #6");
        articles.add("article #7");
        articles.add("article #8");
        articles.add("article #9");
        articles.add("article #10");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, articles);
        articlesList.setAdapter(adapter);
    }
}
