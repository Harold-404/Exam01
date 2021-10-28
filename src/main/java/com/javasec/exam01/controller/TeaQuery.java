package com.javasec.exam01.controller;

import com.javasec.exam01.entity.Teacher;
import com.javasec.exam01.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * (Teacher)表控制层
 *
 * @author JavaExam
 * @since 2021-10-31 06:57:09
 */
@Controller
public class TeaQuery {

    @Resource
    private TeacherService teacherService;

    @GetMapping("/teaQueryResult")
    public String queryBySub(@RequestParam("subname") String subname, Model model) {
        Teacher teacher = this.teacherService.queryBySub(subname);
        model.addAttribute("teacher", teacher);
        return "teaQueryResult";
    }

}