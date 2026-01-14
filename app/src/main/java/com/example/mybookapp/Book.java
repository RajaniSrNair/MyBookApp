package com.example.mybookapp;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String author;
    private String year;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getYear() { return year; }
}
