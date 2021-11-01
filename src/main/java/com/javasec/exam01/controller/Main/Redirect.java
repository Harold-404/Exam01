package com.javasec.exam01.controller.Main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Redirect {
    @RequestMapping("/main/redirect")
    public String redirect(String url) {
        if (url!=null)
            return "redirect:" + url;
        return "main/redirect";
    }
}
