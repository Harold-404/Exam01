package com.javasec.exam01.service.impl;

import com.javasec.exam01.dao.UserDao;
import com.javasec.exam01.entity.User;
import com.javasec.exam01.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Teacher)表服务实现类
 *
 * @author JavaExam
 * @since 2021-10-31 06:57:12
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User queryByUser(String username) {
        return this.userDao.queryByUser(username);
    }
}
