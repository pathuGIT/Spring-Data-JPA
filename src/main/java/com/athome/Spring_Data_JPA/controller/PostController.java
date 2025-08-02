package com.athome.Spring_Data_JPA.controller;

import com.athome.Spring_Data_JPA.model.Comments;
import com.athome.Spring_Data_JPA.model.Posts;
import com.athome.Spring_Data_JPA.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping
    public List<Posts> getPosts(){
        return postService.getPosts();
    }

    @PostMapping
    public Posts createPost(@RequestBody Posts posts){
        return postService.createPost(posts);
    }

}
