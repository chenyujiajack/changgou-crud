package com.changgou.goods.service.impl;

import com.changgou.goods.mapper.BrandMapper;
import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService{
    @Autowired
    private BrandMapper brandMapper;

    //查询所有
    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }
    //根据Id查询
    @Override
    public List<Brand> findById(Integer i) {
        return brandMapper.findById(i);
    }

    @Override
    public int insertSelective(Brand brand) {
         return brandMapper.insertSelective(brand);

    }

    @Override
    public int deleteBrandById(Integer id) {
         return brandMapper.deleteBrandById(id);
    }

    @Override
    public int updateBrand(Integer id, String name,String image, String letter, String seq) {
        return brandMapper.updateBrand(id,name,image,letter,seq);
    }
}
