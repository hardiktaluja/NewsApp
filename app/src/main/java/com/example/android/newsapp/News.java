package com.example.android.newsapp;

public class News {

    private String section;
    private String title;
    private String author;
    private String date;
    private String url;

    public News(String section, String title, String author, String date, String url) {
        this.section = section;
        this.title = title;
        this.author = author;
        this.date = date;
        this.url = url;
    }

    public String getSection() {
        return section;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }
}
