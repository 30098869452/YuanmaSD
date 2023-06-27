package com.example.demo.service;

import com.example.demo.pojo.Type;

import java.util.List;
import java.util.Map;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/21 16:18
 */
public interface TypeService {
    List<Type> findTypeByPage(String typeName, Integer startIndex, Integer pageSize);
    //通过类型关键字查询
    Integer findTypeCount(String typeName);
    //添加type数据
    Integer addType(String typeName,String imageName);

    Integer updateState(Integer id,Integer state);

    Integer updateType(Integer id,String typeName, String imageName);

    Integer deleteType(Integer id);
    List<Map<String,Object>> selectIdAndTypename();
}
