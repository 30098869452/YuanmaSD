package com.example.demo.service;

import com.example.demo.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/25 10:37
 */
public interface ProductService {

    List<Product> findByPage(
            String name,
            String tid,
            String min,
            String max,
            Integer start,
            Integer limit
    );
}
