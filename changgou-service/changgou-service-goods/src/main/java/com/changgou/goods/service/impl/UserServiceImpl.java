package com.changgou.goods.service.impl;

import com.changgou.goods.mapper.UserMapper;
import com.changgou.goods.pojo.Account;
import com.changgou.goods.pojo.UserAccount;
import com.changgou.goods.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<UserAccount> selectUserAccountList(){
     List<UserAccount> users = userMapper.selectUserAccountList();
     return users;
    }
}
