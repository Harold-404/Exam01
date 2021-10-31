package com.javasec.exam01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(value = "/index")
    public String indexPage(Model model){
        return "index";
    }

    @GetMapping(value = "/stuQuery")
    public String stuQueryPage(Model model){
        return "stuQuery";
    }

    @GetMapping(value = "/teaQuery")
    public String teaQueryPage(Model model){
        return "teaQuery";
    }

//    @GetMapping(value = "/msgBoard")
//    public String msgBoardPage(Model model){
//        return "msgBoard";
//    }

    @GetMapping(value = "/download")
    public String downloadPage(Model model){
        return "download";
    }

    @GetMapping(value = "/upload")
    public String uploadPage(Model model){
        return "upload";
    }

    @GetMapping(value = "/register")
    public String registerPage(Model model){
        return "register";
    }

    @GetMapping(value = "/login")
    public String loginPage(Model model){
        return "login";
    }
}
