package com.example.phonlab.newsnet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> articles;
    RecyclerView recyclerView;
    NewsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        articles = new ArrayList<>();
        recyclerView = findViewById(R.id.article_recycler_view);

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

        adapter = new NewsAdapter(this, articles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
