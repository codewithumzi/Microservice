package com.microservice.comment.repostitory;

import com.microservice.comment.entity.Comment;
import org.springframework.cache.CacheManager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,String> {
    List<Comment> findByPostId(String postId);
}
