package com.example.demo.mapper;

import com.example.demo.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/25 10:38
 */
public interface ProductMapper {
    List<Product> queryByPage(
         @Param("name")  String name,
         @Param("tid")  String tid,
         @Param("min")  String min,
         @Param("max")  String max,
         @Param("start")  Integer start,
         @Param("limit")  Integer limit

    );
}
