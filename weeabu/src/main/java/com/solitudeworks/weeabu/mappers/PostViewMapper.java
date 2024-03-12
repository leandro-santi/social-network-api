package com.solitudeworks.weeabu.mappers;

import com.solitudeworks.weeabu.models.PostModel;
import com.solitudeworks.weeabu.views.PostView;

public class PostViewMapper {

    public PostView map(PostModel postModel) {
        return new PostView(
                postModel.getId(),
                postModel.getAuthor(),
                postModel.getText(),
                postModel.getDate()
        );
    }

}
