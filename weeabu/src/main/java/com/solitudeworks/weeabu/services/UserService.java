package com.solitudeworks.weeabu.services;

import com.solitudeworks.weeabu.dtos.UserDto;
import com.solitudeworks.weeabu.mappers.UserDtoMapper;
import com.solitudeworks.weeabu.mappers.UserViewMapper;
import com.solitudeworks.weeabu.models.UserModel;
import com.solitudeworks.weeabu.views.UserView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    private final List<UserModel> userModels = new ArrayList<>();

    private final UserDtoMapper userDtoMapper = new UserDtoMapper();
    private final UserViewMapper userViewMapper = new UserViewMapper();

    public UserView registerUser(UserDto userDto) {
        var user = userDtoMapper.map(userDto);
        user.setId(userModels.size() + 1);
        userModels.add(user);
        return userViewMapper.map(user);
    }

    public List<UserView> listUsers() {
        return userModels.stream().map(userViewMapper::map).collect(Collectors.toList());
    }

}
