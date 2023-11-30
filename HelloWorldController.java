package com.at.university.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/login")
    public String login(){
        return "main";
    }

}
