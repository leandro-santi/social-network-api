package com.solitudeworks.weeabu.services;

import com.solitudeworks.weeabu.dtos.PostDto;
import com.solitudeworks.weeabu.mappers.PostDtoMapper;
import com.solitudeworks.weeabu.mappers.PostViewMapper;
import com.solitudeworks.weeabu.models.PostModel;
import com.solitudeworks.weeabu.utils.Validations;
import com.solitudeworks.weeabu.views.PostView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PostService {

    private final List<PostModel> postModels = new ArrayList<>();

    private final PostDtoMapper postDtoMapper = new PostDtoMapper();
    private final PostViewMapper postViewMapper = new PostViewMapper();

    private final Validations validations = new Validations();

    public PostView createPost(PostDto postDto) {
        // If the user is not registered
        if (!validations.usernameRegisterValidation(postDto.author())) return null;

        var post = postDtoMapper.map(postDto);
        post.setId(postModels.size() + 1);
        postModels.add(post);
        return postViewMapper.map(post);
    }

    public List<PostView> listPosts() {
        return postModels.stream().map(postViewMapper::map).collect(Collectors.toList());
    }

    public PostView searchPost(int id) {
        for (PostModel post : postModels) {
            if (post.getId() == id) {
                return postViewMapper.map(post);
            }
        }
        return null;
    }

}
