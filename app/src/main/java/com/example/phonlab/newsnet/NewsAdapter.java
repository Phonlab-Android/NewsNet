package com.example.phonlab.newsnet;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private Context context;
    private List<String> articles;

    public NewsAdapter(Context context, List<String> articles) {
        this.context = context;
        this.articles = articles;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item, parent, false);
        NewsViewHolder holder = new NewsViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        String currentString = articles.get(position);
        holder.textView.setText(currentString);
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public NewsViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
        }
    }

}
