package com.javasec.exam01.controller;

import com.javasec.exam01.entity.User;
import com.javasec.exam01.util.CustomPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class Register {
    @Resource
    private com.javasec.exam01.mapper.UserMapper UserMapper;
    @RequestMapping("/register")
    public String registerSave(@ModelAttribute User user,
                               Model model) {
        // 判断 username password 不能为空
        if (user.getUsername() == null || user.getPassword() == null || user.getRole() == null) {
            model.addAttribute("error", "注册失败");
            return "register";
        }
        try {
//             密码加密存储
            CustomPasswordEncoder customPasswordEncoder = new CustomPasswordEncoder();
            String password = customPasswordEncoder.encode(user.getPassword());
            user.setPassword(password);
            // 写入数据库
            UserMapper.insert(user);
            return "redirect:/login";
        } catch (Exception e) {
            model.addAttribute("error", "注册失败");
            return "register";
        }
    }
}
