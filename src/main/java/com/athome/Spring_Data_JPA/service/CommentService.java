package com.athome.Spring_Data_JPA.service;

import com.athome.Spring_Data_JPA.model.Comments;
import com.athome.Spring_Data_JPA.model.Posts;
import com.athome.Spring_Data_JPA.repository.CommentRepository;
import com.athome.Spring_Data_JPA.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostRepository postRepository;


    public Posts addCommentForExisting(int id, Comments comments) {
        Posts post = postRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Not found"));
        comments.setPosts(post);
        commentRepository.save(comments);

        return postRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Not found"));
    }
}
