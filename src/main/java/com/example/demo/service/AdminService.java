package com.example.demo.service;

import com.example.demo.pojo.Admin;
import org.springframework.stereotype.Service;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/20 15:50
 */

public interface AdminService {
    Admin findAdminByAccounAndPwd(String account, String pwd);


}
