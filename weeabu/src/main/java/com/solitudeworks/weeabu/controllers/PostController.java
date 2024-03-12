package com.solitudeworks.weeabu.controllers;

import com.solitudeworks.weeabu.dtos.PostDto;
import com.solitudeworks.weeabu.services.PostService;
import com.solitudeworks.weeabu.views.PostView;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService = new PostService();

    @GetMapping()
    private List<PostView> postViewList() {
        return postService.listPosts();
    }

    @GetMapping("/{id}")
    private PostView postViewSearch(@PathVariable int id) {
        return postService.searchPost(id);
    }

    @PostMapping
    private ResponseEntity<PostView> post(@RequestBody @Valid PostDto postDto,
                                          UriComponentsBuilder uriComponentsBuilder) {
        var post = postService.createPost(postDto);
        var uri = uriComponentsBuilder.path("/posts/" + post.id()).build().toUri();
        return ResponseEntity.created(uri).body(post);
    }

}
