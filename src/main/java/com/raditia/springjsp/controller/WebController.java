package com.raditia.springjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @RequestMapping("/")
    public ModelAndView home() {

        String message = "KUWONSOLE!";

        return new ModelAndView("index", "message", message);
    }

    @GetMapping("/add_user")
    public ModelAndView addUser() {

        return new ModelAndView("add_user");
    }
}
