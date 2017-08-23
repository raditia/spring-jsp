package com.raditia.springjsp.controller;

import com.raditia.springjsp.DAO.UserDao;
import com.raditia.springjsp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    @PostMapping("/add_user")
    public ModelAndView addUser(@ModelAttribute("user") User user) {

        int status = UserDao.insertUser(user);

        if (status == 1) {

            return new ModelAndView("redirect:/view_user");
        }
        else {

            return new ModelAndView("redirect:/view_user");
        }
    }

    @RequestMapping("/view_user")
    public ModelAndView viewAllUser() {

        List<User> userList = UserDao.getAllUser();

        return new ModelAndView("view_user", "userList", userList);
    }

    @RequestMapping("/delete_user")
    public ModelAndView deleteUser(@PathVariable int id) {

        // TODO: Insert function here

        
    }
}
