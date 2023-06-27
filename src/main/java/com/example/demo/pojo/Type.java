package com.example.demo.pojo;

import lombok.Data;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/21 14:11
 */
@Data
public class Type {
    private Integer id;
//    类型名称
    private String typename;
//    奶茶类型的存储路径
    private String tImageURL;
//    状态
    private Integer tState;

}
