package com.example.muhammad.nytimespopulararticles.adapter;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.muhammad.nytimespopulararticles.R;
import com.example.muhammad.nytimespopulararticles.main_activity.RecyclerItemClickListener;
import com.example.muhammad.nytimespopulararticles.model.Article;

import java.util.ArrayList;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder> {

    private ArrayList<Article> dataList;
    private RecyclerItemClickListener recyclerItemClickListener;

    public ArticleAdapter(ArrayList<Article> dataList , RecyclerItemClickListener recyclerItemClickListener) {
        this.dataList = dataList;
        this.recyclerItemClickListener = recyclerItemClickListener;
    }


    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.single_view_row, parent, false);
        return new ArticleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.txtArticleTitle.setText(dataList.get(position).getTitle());
        holder.txtArticleAuthor.setText(dataList.get(position).getAuthor());
        holder.txtArticleDate.setText(dataList.get(position).getDate());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerItemClickListener.onItemClick(dataList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class ArticleViewHolder extends RecyclerView.ViewHolder {

        TextView txtArticleTitle, txtArticleAuthor, txtArticleDate;

        ArticleViewHolder(View itemView) {
            super(itemView);
            txtArticleTitle =  (TextView) itemView.findViewById(R.id.txt_notice_title);
            txtArticleAuthor =  (TextView) itemView.findViewById(R.id.txt_notice_brief);
            txtArticleDate = (TextView)  itemView.findViewById(R.id.txt_notice_file_path);

        }
    }
}