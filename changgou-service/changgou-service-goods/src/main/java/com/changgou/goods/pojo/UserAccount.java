package com.changgou.goods.pojo;
//多表查询实体类
public class UserAccount extends User{
    private Integer money;

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
