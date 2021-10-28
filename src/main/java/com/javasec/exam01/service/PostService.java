package com.javasec.exam01.service;

import com.javasec.exam01.entity.Post;

import java.util.Map;

public interface PostService {

    void createPost(Post post);

    void deletePost(Long postId);

    void updatePost(Post post);

    Map<String, Object> findPost(Long postId);

    Map<String, Object> findAllPosts();

}
