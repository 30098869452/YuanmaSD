package com.example.demo.controller;

import com.example.demo.pojo.Admin;
import com.example.demo.pojo.entity.RespCode;
import com.example.demo.pojo.entity.RespData;
import com.example.demo.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description：处理admin相关的请求
 * @Author：李康
 * @Date：2023/6/20 16:23
 */
@RestController//等价于@Controller和@ResponseBody

public class AdminController {
    @Resource
    AdminService adminService;

    @PostMapping("/login") //表示该方法只处理/login提交的请求
    @ResponseBody//将方法的放回值直接作为响应体
    public RespData login(@RequestParam("account") String a,
                       @RequestParam("pwd") String p){
        Admin info = adminService.findAdminByAccounAndPwd(a, p);
        if(info!=null)
        {
            return  new RespData(RespCode.SUCCESS,info);

        }
        return new RespData(RespCode.ERROR_1);

    }

}
