package com.example.sprintuser.mapper;

import com.example.sprintuser.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> listAll();
}

