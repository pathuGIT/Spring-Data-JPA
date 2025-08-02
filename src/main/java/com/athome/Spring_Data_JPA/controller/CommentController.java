package com.athome.Spring_Data_JPA.controller;

import com.athome.Spring_Data_JPA.model.Comments;
import com.athome.Spring_Data_JPA.model.Posts;
import com.athome.Spring_Data_JPA.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public Posts addCommentForExisting(@RequestParam int id, @RequestBody Comments comments){
        return commentService.addCommentForExisting(id, comments);
    }

}
