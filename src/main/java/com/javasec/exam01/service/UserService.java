package com.javasec.exam01.service;

import com.javasec.exam01.entity.User;

/**
 * (Teacher)表服务接口
 *
 * @author JavaExam
 * @since 2021-10-31 06:57:12
 */
public interface UserService {

    User queryByUser(String username);

}
