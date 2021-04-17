package com.changgou.goods.controller;

import com.changgou.goods.pojo.User;
import com.changgou.goods.pojo.UserAccount;
import com.changgou.goods.service.UserService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public Result<UserAccount> selectUserAccountList(){
        List<UserAccount> users=userService.selectUserAccountList();
        return new Result<UserAccount>(true, StatusCode.OK,"更新成功",users) ;
    }

}
