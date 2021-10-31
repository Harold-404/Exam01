package com.javasec.exam01.controller;

import com.javasec.exam01.entity.User;
import com.javasec.exam01.service.StuQueryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * (Teacher)表控制层
 *
 * @author JavaExam
 * @since 2021-10-31 06:57:09
 */
@Controller
public class StuQuery {

    @Resource
    private StuQueryService stuQueryService;

    @GetMapping("/stuQuery")
    public String selectOne(String id, Model model) throws Exception{
        User user = stuQueryService.selectUserByStatement(id);
        model.addAttribute("user", user);
        return "stuQuery";
    }

}