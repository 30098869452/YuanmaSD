package com.example.demo.service.impl;

import com.example.demo.mapper.AdminMapper;
import com.example.demo.pojo.Admin;
import com.example.demo.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/20 15:57
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminMapper adminMapper;
    @Override
    public Admin findAdminByAccounAndPwd(String account, String pwd) {
        return adminMapper.queryInfoAccoutAndPwd(account,pwd);
    }
}
