package com.example.demo.repository;

import com.example.demo.model.Post;
import org.springframework.data.repository.Repository;

public interface PostRepository extends Repository<Post, Long> {
    Post findByPostId(Long postId);
}
