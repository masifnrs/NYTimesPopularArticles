package com.example.muhammad.nytimespopulararticles.model;

import com.google.gson.annotations.SerializedName;

public class Article {

    @SerializedName("published_date")
    private String date;
    @SerializedName("title")
    private String title;
    @SerializedName("byline")//("brief")
    private String author;
    @SerializedName("section")
    private String my_secion;

    public Article(String date, String title, String author, String my_secion) {
        this.date = date;
        this.author = author;
        this.title = title;
        this.my_secion = my_secion;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String id) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String brief) {
        this.author = author;
    }

    public String getSection() {
        return my_secion;
    }

    public void setSection(String fileSource) {
        this.my_secion = my_secion;
    }
}