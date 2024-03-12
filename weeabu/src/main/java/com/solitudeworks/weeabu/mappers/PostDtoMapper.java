package com.solitudeworks.weeabu.mappers;

import com.solitudeworks.weeabu.dtos.PostDto;
import com.solitudeworks.weeabu.models.PostModel;

public class PostDtoMapper {

    public PostModel map(PostDto postDto) {
        return new PostModel(
                -1,
                postDto.text(),
                postDto.author()
        );
    }

}
