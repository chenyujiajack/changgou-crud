package com.changgou.goods.controller;

import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
@CrossOrigin
public class BrandController {

    @Autowired
    private BrandService brandService;

    /***
     * 查询全部数据
     * @return
     */
    @RequestMapping("/findAll")
    public Result<Brand> findAll(){
        List<Brand> brandList =  brandService.findAll();
        return new Result<Brand>(true, StatusCode.OK,"查询成功",brandList) ;
    }

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    @GetMapping("/findById")
    public Result<Brand> findById(@RequestParam("id") Integer id){
        List<Brand> brandList = brandService.findById(id);
        return new Result<Brand>(true, StatusCode.OK,"查询成功",brandList) ;
    }

    @PostMapping
    public Result<Brand> insertSelective(@RequestBody Brand brand){
        int brandList = brandService.insertSelective(brand);
        return new Result<Brand>(true, StatusCode.OK,"添加成功",brandList) ;
    }



    @PostMapping("/update")
    public Result<Brand> updateBrand(@RequestParam("id") Integer id, @RequestParam("name") String name,@RequestParam("image") String image,@RequestParam("letter") String letter,@RequestParam("seq")String seq){
        int brandList = brandService.updateBrand(id,name,image,letter,seq);
        return new Result<Brand>(true, StatusCode.OK,"更新成功",brandList) ;
    }



}