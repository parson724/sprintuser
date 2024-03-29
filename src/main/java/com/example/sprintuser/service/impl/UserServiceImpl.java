package com.example.sprintuser.service.impl;



import com.example.sprintuser.entity.User;
import com.example.sprintuser.mapper.UserMapper;
import com.example.sprintuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAll() {
        return userMapper.listAll();
    }
}

