package com.how2java.tmall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForePageController {
    @GetMapping("/")
    public String index(){
        return "redirect:home";
    }
    @GetMapping("/home")
    public String home(){
        return "fore/home";
    }
    @GetMapping("/login")
    public String login() { return "fore/login"; }
    @GetMapping("/register")
        public String register() { return "fore/register";}
    @GetMapping(value="/registerSuccess")
    public String registerSuccess() { return "fore/registerSuccess";}
}