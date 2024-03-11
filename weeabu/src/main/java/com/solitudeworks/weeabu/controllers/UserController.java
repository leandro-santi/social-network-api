package com.solitudeworks.weeabu.controllers;

import com.solitudeworks.weeabu.dtos.UserDto;
import com.solitudeworks.weeabu.services.UserService;
import com.solitudeworks.weeabu.views.UserView;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService = new UserService();

    @GetMapping
    private List<UserView> userViewList() {
        return userService.listUsers();
    }

    @PostMapping
    private ResponseEntity<UserView> registerUser(@RequestBody @Valid UserDto userDto,
                                                  UriComponentsBuilder uriComponentsBuilder) {
        var user = userService.registerUser(userDto);
        var uri = uriComponentsBuilder.path("/topic/${topicView.id}").build().toUri();
        return ResponseEntity.created(uri).body(user);

    }

}
