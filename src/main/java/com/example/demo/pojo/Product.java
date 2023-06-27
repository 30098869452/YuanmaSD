package com.example.demo.pojo;

import lombok.Data;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/25 10:24
 */
@Data
public class Product {
    private Integer id;
    private String pName;
    private Integer typeId;
    private Double tPrice;
    private String tIntroduce;
    private String pImageUrl;
    private Integer pHotstate;
    private String pDiscount;
    /*
    * 表示禁用和启用*/
    private Integer pState;
    private Type type;
}
