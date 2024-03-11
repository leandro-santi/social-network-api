package com.solitudeworks.weeabu.mappers;

import com.solitudeworks.weeabu.dtos.UserDto;
import com.solitudeworks.weeabu.models.UserModel;

import java.util.ArrayList;

public class UserDtoMapper {

    public UserModel map(UserDto userDto) {
        return new UserModel(
                -1,
                userDto.username(),
                userDto.about(),
                userDto.email(),
                userDto.password(),
                0,
                new ArrayList<>()
        );
    }

}
