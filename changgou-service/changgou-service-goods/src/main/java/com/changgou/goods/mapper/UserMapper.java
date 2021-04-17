package com.changgou.goods.mapper;

import com.changgou.goods.pojo.Account;
import com.changgou.goods.pojo.UserAccount;

import java.util.List;

public interface UserMapper {
    List<UserAccount> selectUserAccountList();
}
