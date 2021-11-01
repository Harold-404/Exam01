package com.javasec.exam01.controller.Main;

import com.javasec.exam01.entity.User;
import com.javasec.exam01.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class Info {

    @Resource
    private UserService userService;

    @RequestMapping("/main/info")
    public String getInfo(String username, Model model) {
        username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = this.userService.queryByUser(username);
        model.addAttribute("user", user);
        return "main/info";
    }

}
