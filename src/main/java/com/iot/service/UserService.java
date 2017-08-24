package com.iot.service;

import com.iot.dao.UserDao;
import com.iot.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Created by guoyanlei
 * date：2017/8/3
 * time：14:55
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User findUserById(int id) throws IOException {
        return userDao.queryById(id);
    }
}
