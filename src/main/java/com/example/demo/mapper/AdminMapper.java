package com.example.demo.mapper;

import com.example.demo.pojo.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/20 14:19
 */
public interface AdminMapper {
    /*
    * 根据账号 密码查询管理信息
    *
    * */

    /**
     *
     * @param acount
     * @param pwd
     * @return
     */
    Admin queryInfoAccoutAndPwd(@Param("account")String acount, @Param("pwd")String pwd);

}
