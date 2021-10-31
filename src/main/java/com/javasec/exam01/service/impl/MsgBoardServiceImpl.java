package com.javasec.exam01.service.impl;

import com.javasec.exam01.dao.MsgBoardDao;
import com.javasec.exam01.entity.MsgBoard;
import com.javasec.exam01.service.MsgBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("postService")
@Transactional
public class MsgBoardServiceImpl implements MsgBoardService {

    @Autowired
    private MsgBoardDao msgBoardDao;

    @Override
    public void createPost(MsgBoard msgBoard) {
        msgBoard.setCreationDate(new Timestamp(System.currentTimeMillis()));
        this.msgBoardDao.save(msgBoard);
    }

    @Override
    public void deletePost(Long postId) {
        this.msgBoardDao.delete(postId);
    }

    @Override
    public void updatePost(MsgBoard msgBoard) {
        this.msgBoardDao.update(msgBoard);
    }

    @Override
    public Map<String, Object> findPost(Long postId) {
        Map<String, Object> attributes = new HashMap<>();
        MsgBoard msgBoard = this.msgBoardDao.find(postId);
        attributes.put("post", msgBoard);
        return attributes;
    }

    @Override
    public Map<String, Object> findAllPosts() {
        Map<String, Object> attributes = new HashMap<>();
        List<MsgBoard> allMsgBoards = this.msgBoardDao.findAll();
        // all posts
        attributes.put("posts", allMsgBoards);
        // provide a new data transfer object
        attributes.put("postDto", new MsgBoard());
        return attributes;
    }

}

