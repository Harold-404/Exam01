package com.javasec.exam01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


    @Controller
    public class AdminController {
        @GetMapping(value = "/admin/admin")
        public String adminPage(Model model){
            return "admin/admin";
        }

        @GetMapping(value = "/admin/dataQuery")
        public String dataQueryPage(Model model){
            return "admin/dataQuery";
        }

        @GetMapping(value = "/admin/ping")
        public String pingPage(Model model){
            return "admin/ping";
        }

        @GetMapping(value = "/admin/test")
        public String testPage(Model model){
            return "admin/test";
        }

        @GetMapping(value = "/admin/logout")
        public String logoutPage(Model model){
            return "redirect:/";
        }
}
