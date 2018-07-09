package com.example.muhammad.nytimespopulararticles.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ArticleList {

    @SerializedName("results")//("notice_list")
    private ArrayList<Article> articleList;

    public ArrayList<Article> getNoticeArrayList() {
        return articleList;
    }

    public void setNoticeArrayList(ArrayList<Article> articleList) {
        this.articleList = articleList;
    }
}