package com.example.demo.controller;

import com.example.demo.pojo.entity.RespData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/25 14:51
 */
@Controller
@RequestMapping("/product")
public class ProductController {


    @GetMapping("/getByPage")
    public RespData getByPage(String productName,Integer typeId,Double min,Integer page,Integer limit)
    {
        return  null;
    }
}
