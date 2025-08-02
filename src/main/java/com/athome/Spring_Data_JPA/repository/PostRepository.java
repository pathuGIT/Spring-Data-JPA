package com.athome.Spring_Data_JPA.repository;

import com.athome.Spring_Data_JPA.model.Posts;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Posts, Integer> {
}
