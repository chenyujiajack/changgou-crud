package com.changgou.goods.pojo;

import javax.persistence.Column;

/**
 * 用户实体类
 */

public class User {

    private Integer id;
    private String username;
    @Column(name = "image")
    private String image;//相册封面
    @Column(name = "image_items")
    private String imageItems;//图片列表

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageItems() {
        return imageItems;
    }

    public void setImageItems(String imageItems) {
        this.imageItems = imageItems;
    }
}
