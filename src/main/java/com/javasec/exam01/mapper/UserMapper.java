package com.javasec.exam01.mapper;

import com.javasec.exam01.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

//    int insert(User user);
    /**
     * 注册  插入一条user记录
     *
     * @param user
     * @return
     */
    @Insert("insert into user (username, password, role, age, address, email, phone)" +
            "values(#{username},#{password},'USER',#{age},#{address},#{email},#{phone})")
    //加入该注解可以保存对象后，查看对象插入id
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insert(User user);
    /**
     * 根据用户 Username 查询用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    @Select("Select id, username, password, role, age, phone, address, email From user Where username=#{username}")
    User selectByUsername(String username);
}