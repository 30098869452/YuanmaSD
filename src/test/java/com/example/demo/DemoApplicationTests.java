package com.example.demo;

import com.example.demo.mapper.AdminMapper;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.mapper.TypeMapper;
import com.example.demo.pojo.Admin;
import com.example.demo.pojo.Type;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    AdminMapper adminMapper;
    @Resource
    TypeMapper typeMapper;
  @Test
    void testQueryInfoByAccountAndPwd(){
      Admin info = adminMapper.queryInfoAccoutAndPwd("admin","admin123");
      System.out.println(info);
  }
    @Test
    void queryAlltype(){
        //List<Type> types = typeMapper.qureyAllType();


        //types.stream().forEach(System.out::println);
        List<Type> cow = typeMapper.queryTypeByPage("茶", 0, 3);

        Integer integer = typeMapper.queryTypeCount("茶");
        System.out.println(integer);

    }
    @Resource
    ProductMapper productMapper;
    @Test
    void  queryByPage(){
      productMapper.queryByPage("奶茶",null,null,null,0,10);
    }
}
