package com.athome.Spring_Data_JPA.repository;

import com.athome.Spring_Data_JPA.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comments, Integer> {
}
