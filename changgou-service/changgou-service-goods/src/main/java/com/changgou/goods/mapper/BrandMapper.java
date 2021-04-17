package com.changgou.goods.mapper;

import com.changgou.goods.pojo.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
public interface BrandMapper {
    //查询所有
    List<Brand> findAll();
    //根据Id查询
    List<Brand> findById(Integer id);
    //插入brand
    int insertSelective(Brand brand);

    int deleteBrandById(Integer id);

    int updateBrand(Integer id, String name,String image,String letter, String seq);
}
