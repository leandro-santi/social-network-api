package com.solitudeworks.weeabu.models;

import java.util.List;

public class UserModel {
    private int id;
    private String username;
    private String about;
    private String email;
    private String password;
    private int coins;
    private List<PostModel> posts;

    public UserModel(int id, String username, String about, String email, String password, int coins, List<PostModel> posts) {
        this.id = id;
        this.username = username;
        this.about = about;
        this.email = email;
        this.password = password;
        this.coins = coins;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public List<PostModel> getPosts() {
        return posts;
    }

    public void setPosts(List<PostModel> posts) {
        this.posts = posts;
    }
}

