package com.example.demo.pojo.entity;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/21 10:03
 */
public class RespData {
    private String code;
    private String msg;


    private Object data;
    public RespData(RespCode code) {
        this.code=code.getCode();
        this.msg=code.getMsp();
    }

    public RespData(RespCode code,Object data) {
        this.code=code.getCode();
        this.msg=code.getMsp();
        this.data=data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
