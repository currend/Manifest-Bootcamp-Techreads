package com.manifestcorp.Techreads.model;

import org.springframework.data.annotation.Id;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.ArrayList;
import java.util.List;

@Entity
    public class Book {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    String title;

    String author;

    String cover;

    int rating;
    public Book() {}



    public Book(String title, String author, int rating, String cover) {

        this.title = title;
        this.author = author;
        this.rating = rating;
        this.cover = cover;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public void setAuthor(String author) {

        this.author = author;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }



}


