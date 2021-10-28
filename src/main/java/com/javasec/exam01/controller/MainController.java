package com.javasec.exam01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping(value = "/main/main")
    public String indexPage(Model model){
        return "main/main";
    }

    @GetMapping(value = "/main/ping")
    public String stuQueryPage(Model model){
        return "main/ping";
    }

    @GetMapping(value = "/main/info")
    public String infoPage(Model model){
        return "main/info";
    }

    @GetMapping(value = "/main/url")
    public String urlPage(Model model){
        return "main/url";
    }

    @GetMapping(value = "/main/download")
    public String downloadPage(Model model){
        return "main/download";
    }

    @GetMapping(value = "/main/upload")
    public String uploadPage(Model model){
        return "main/upload";
    }

    @GetMapping(value = "/main/test")
    public String testPage(Model model){
        return "main/test";
    }

    @GetMapping(value = "/main/logout")
    public String logoutPage(Model model){
        return "redirect:/";
    }

    @GetMapping(value = "/main/admin")
    public String adminPage(Model model){
        return "admin/admin";
    }

}
