package com.changgou.goods.service;

import com.changgou.goods.pojo.Brand;


import java.util.List;


public interface BrandService {
    /**
     * 根据ID查询
     *
     * @param
     * @return
     */
    //查询所有
    List<Brand> findAll();
    //根据id查询
    List<Brand> findById(Integer id);

    //新增
    int insertSelective(Brand brand);

    int deleteBrandById(Integer id);

    int updateBrand(Integer id, String name,String image, String letter, String seq);
}
