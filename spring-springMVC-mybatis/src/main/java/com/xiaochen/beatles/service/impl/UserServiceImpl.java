package com.xiaochen.beatles.service.impl;

import com.xiaochen.beatles.mapper.UsersMapper;
import com.xiaochen.beatles.pojo.Users;
import com.xiaochen.beatles.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Author xiaochen
 * @Description
 * @Date 23:10 2020/3/28
 * @Param
 * @return
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int insert(Users users) {
        int insert = usersMapper.insert(users);
        if (insert > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public Users getUsersById(int uid) {
        return usersMapper.getUsersById(uid);
    }

    @Override
    public List getUsers() {
        return usersMapper.getUsers();
    }
}
