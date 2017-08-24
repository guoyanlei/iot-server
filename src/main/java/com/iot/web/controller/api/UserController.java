package com.iot.web.controller.api;

import com.iot.entity.User;
import com.iot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Created by guoyanlei
 * date：2017/8/3
 * time：14:57
 */
@Controller
@RequestMapping("/backend/api/users")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public User login(@RequestParam(value = "id", required = true) int id) throws IOException {

        return userService.findUserById(id);
    }

}
