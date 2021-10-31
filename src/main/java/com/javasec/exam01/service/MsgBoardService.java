package com.javasec.exam01.service;

import com.javasec.exam01.entity.MsgBoard;

import java.util.Map;

public interface MsgBoardService {

    void createPost(MsgBoard msgBoard);

    void deletePost(Long postId);

    void updatePost(MsgBoard msgBoard);

    Map<String, Object> findPost(Long postId);

    Map<String, Object> findAllPosts();

}
