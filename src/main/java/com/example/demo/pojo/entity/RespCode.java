package com.example.demo.pojo.entity;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/21 9:51
 */

public enum RespCode {
    SUCCESS("0","请求成功"),
    ERROR_1("5001","账号密码错误"),
    ERROR_2("5002","获取数据失败"),
    ERROR_3("5003","未搜索到指定的商品"),
    ERROR_4("5004","添加数据失败"),
    ERROR_5("5005","状态修改失败"),
    ERROR_6("5006","为找到指定的id删除失败!!!"),
    FATL("9999","网络错误");
    /*
    * 自定义响应码的描述*/
    private String code;
    private String msp;

    RespCode() {
    }

    RespCode(String code, String msp) {
        this.code = code;
        this.msp = msp;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsp() {
        return msp;
    }

    public void setMsp(String msp) {
        this.msp = msp;
    }

}
