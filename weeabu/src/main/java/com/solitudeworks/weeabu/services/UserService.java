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

    private static final List<UserModel> userModels = new ArrayList<>();

    private final UserDtoMapper userDtoMapper = new UserDtoMapper();
    private final UserViewMapper userViewMapper = new UserViewMapper();

    public UserView registerUser(UserDto userDto) {
        var user = userDtoMapper.map(userDto);
        user.setId(userModels.size() + 1);
        userModels.add(user);
        System.out.println(userModels.size());
        return userViewMapper.map(user);
    }

    public List<UserView> listUsers() {
        return userModels.stream().map(userViewMapper::map).collect(Collectors.toList());
    }

    public UserView searchUser(int id) {
        for (UserModel user : userModels) {
            if (user.getId() == id) {
                return userViewMapper.map(user);
            }
        }
        return null;
    }

    public Boolean checkUsernameRegister(String username) {
        for (UserModel userModel : userModels) {
            if (userModel.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

}
