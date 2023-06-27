package com.example.demo.service.impl;

import com.example.demo.mapper.ProductMapper;
import com.example.demo.pojo.Product;
import com.example.demo.service.ProductService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/25 14:44
 */
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductMapper productMapper;

    @Override
    public List<Product> findByPage(String name, String tid, String min, String max, Integer start, Integer limit) {
        return  productMapper.queryByPage(name,tid,min,max,start,limit);
    }
}
