package com.athome.Spring_Data_JPA.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    @JsonIgnore
    private Posts posts;

    public Comments() {
    }

    public Comments(int id, String text, Posts posts) {
        this.id = id;
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
