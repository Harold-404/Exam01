package com.javasec.exam01.service.impl;


import com.javasec.exam01.entity.User;
import com.javasec.exam01.service.StuQueryService;
import com.javasec.exam01.util.DBUtil;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Service
public class StuQueryServiceImpl implements StuQueryService {

    public User selectUserByStatement(String id){
        // 拼接sql语句
        String sql ="select * from user where id = "+id;
        try {
            // 获取statement对象
            Statement statement = DBUtil.getConnection().createStatement();
            // 执行sql语句，返回 ResultSet
            ResultSet resultSet = statement.executeQuery(sql);
            User user = new User();
            // 一条也只能使用resultSet来接收
            while(resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setAge(resultSet.getInt("age"));
                user.setPhone(resultSet.getString("phone"));
            }
            return user;
        } catch (SQLException e) {
            User user = new User();
            user.setUsername(e.toString());
            return user;
        }
    }

}