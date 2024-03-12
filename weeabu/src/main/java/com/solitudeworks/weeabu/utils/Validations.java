package com.solitudeworks.weeabu.utils;

import com.solitudeworks.weeabu.services.UserService;

public class Validations {

    private final UserService user = new UserService();

    public Boolean usernameRegisterValidation(String username) {
        return user.checkUsernameRegister(username);
    }

}
