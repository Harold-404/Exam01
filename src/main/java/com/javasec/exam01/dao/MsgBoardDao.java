package com.javasec.exam01.dao;

import com.javasec.exam01.entity.MsgBoard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MsgBoardDao {

    void save(MsgBoard msgBoard);

    void delete(Long postId);

    void update(MsgBoard msgBoard);

    MsgBoard find(Long postId);

    List<MsgBoard> findAll();

}
