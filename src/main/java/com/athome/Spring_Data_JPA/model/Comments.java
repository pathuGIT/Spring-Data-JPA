package com.athome.Spring_Data_JPA.model;

import jakarta.persistence.*;

@Entity
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private Posts posts;

    public Comments() {
    }

    public Comments(String text, Posts posts) {
        this.text = text;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }
}
