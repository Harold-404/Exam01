package com.javasec.exam01.service.impl;

import com.javasec.exam01.dao.TeacherDao;
import com.javasec.exam01.entity.Teacher;
import com.javasec.exam01.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Teacher)表服务实现类
 *
 * @author JavaExam
 * @since 2021-10-31 06:57:12
 */
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;

    @Override
    public Teacher queryBySub(String subname) {
        return this.teacherDao.queryBySub(subname);
    }
}
