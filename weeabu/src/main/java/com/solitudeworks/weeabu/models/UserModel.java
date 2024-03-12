package com.solitudeworks.weeabu.models;

import lombok.Data;

import java.util.List;

@Data
public class UserModel {

    private int id;
    private String username;
    private String about;
    private String email;
    private String password;
    private int coins;
    private List<PostModel> posts;
    private UserFeatures features;

    public UserModel(int id, String username, String about, String email, String password, int coins, List<PostModel> posts) {
        this.id = id;
        this.username = username;
        this.about = about;
        this.email = email;
        this.password = password;
        this.coins = coins;
        this.posts = posts;
        this.features = new UserFeatures(
                true,
                true,
                true,
                true,
                true,
                true
        );
    }

}
