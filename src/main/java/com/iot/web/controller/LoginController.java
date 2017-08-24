package com.iot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by guoyanlei
 * date：2017/7/26
 * time：16:39
 */
@Controller
@RequestMapping("/backend/auth")
public class LoginController {

    @RequestMapping(value = "login",method = RequestMethod.GET)
    @ResponseBody
    public String login(){
        System.out.println("login");
        return "redirect:login.jsp";
    }
}
