package com.magicvalleyworks.learning.simpleblogapp.dto;

public class BlogPost {
    private long id;
    private String author;
    private String message;

    public long getId() {
        return id;
    }

    public BlogPost setId(long id) {
        this.id = id;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public BlogPost setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public BlogPost setMessage(String message) {
        this.message = message;
        return this;
    }
}
