package com.solitudeworks.weeabu.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostModel {

    private int id;
    private String text;
    private LocalDateTime date = LocalDateTime.now();
    private String author;

    public PostModel(int id, String text, String author) {
        this.id = id;
        this.text = text;
        this.author = author;
    }

}
