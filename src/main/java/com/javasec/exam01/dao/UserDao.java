package com.javasec.exam01.dao;

import com.javasec.exam01.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Teacher)表数据库访问层
 *
 * @author JavaExam
 * @since 2021-10-31 06:57:09
 */
@Mapper
public interface UserDao {

    User queryByUser(String username);

}

