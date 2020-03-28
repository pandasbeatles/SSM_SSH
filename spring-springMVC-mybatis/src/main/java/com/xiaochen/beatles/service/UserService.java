package com.xiaochen.beatles.service;

import com.xiaochen.beatles.pojo.Users;

import java.util.List;

public interface UserService {
    public int insert(Users users);

    public Users getUsersById(int uid);

    public List getUsers();
}
