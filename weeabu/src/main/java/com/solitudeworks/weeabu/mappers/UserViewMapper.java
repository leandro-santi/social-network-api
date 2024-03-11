package com.solitudeworks.weeabu.mappers;

import com.solitudeworks.weeabu.dtos.UserDto;
import com.solitudeworks.weeabu.models.UserModel;
import com.solitudeworks.weeabu.views.UserView;

public class UserViewMapper {

    public UserView map(UserModel userModel) {
        return new UserView(
                userModel.getId(),
                userModel.getUsername(),
                userModel.getAbout()
        );
    }

}
