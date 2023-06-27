package com.example.demo.pojo.entity;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/21 16:42
 */
public class RespDataAndCount extends RespData{

    /**
     * 数据总量
     */
    private Integer count;

    public RespDataAndCount(RespCode code) {
        super(code);
    }

    public RespDataAndCount(RespCode code, Object data,Integer count) {
        super(code, data);
        this.count=count;
    }
}
