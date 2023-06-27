package com.example.demo.pojo;

import lombok.Data;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/20 14:03
 */
@Data
public class Admin {
    //    id
    private Integer aId;
    //    账号
    private String aAccount;
    //    密码
    private String aPwd;
    //    管理员头像
    private String aHeadPhoto;
    //    昵称
    private String aName;
    //    电话号码
    private String aPhone;
    //    性别
    private String aGender;
    //    年龄
    private String aAge;


}
