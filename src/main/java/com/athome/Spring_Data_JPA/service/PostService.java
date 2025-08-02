package com.athome.Spring_Data_JPA.service;

import com.athome.Spring_Data_JPA.model.Comments;
import com.athome.Spring_Data_JPA.model.Posts;
import com.athome.Spring_Data_JPA.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Posts> getPosts() {
       return postRepository.findAll();
    }

    public Posts createPost(Posts posts) {
        // Ensure comments are properly linked back to the post
        if (posts.getComments() != null) {
            for (Comments comment : posts.getComments()) {
                comment.setPosts(posts);
            }
        }

        // Save post and return the persisted entity
        return postRepository.save(posts);
    }

}
