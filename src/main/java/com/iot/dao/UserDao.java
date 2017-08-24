package com.iot.dao;

import com.iot.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    User queryById(Integer id);

    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    int updateName(@Param("name") String name, @Param("id") int id);

}