package com.changgou.goods.service;

import com.changgou.goods.pojo.Account;
import com.changgou.goods.pojo.UserAccount;

import java.util.List;

public interface UserService {
    List<UserAccount> selectUserAccountList();
}
