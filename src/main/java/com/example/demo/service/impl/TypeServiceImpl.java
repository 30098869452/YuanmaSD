package com.example.demo.service.impl;

import com.example.demo.mapper.TypeMapper;
import com.example.demo.pojo.Type;
import com.example.demo.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/21 16:19
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    TypeMapper typeMapper;

    @Override
    public List<Type> findTypeByPage(String typeName, Integer startIndex, Integer pageSize) {
        return typeMapper.queryTypeByPage(typeName,startIndex,pageSize);

    }

    @Override
    public Integer findTypeCount(String typeName) {
        return typeMapper.queryTypeCount(typeName);
    }

    @Override
    public Integer addType(String typeName, String imageName) {

        Type type=new Type();
        type.setTypename(typeName);
        type.setTImageURL("/images/typeImg/"+imageName+".png");
        type.setTState(0);


        return typeMapper.insertType(type);
    }

    @Override
    public Integer updateState(Integer id, Integer state) {
        return typeMapper.updatestate(id,state);
    }

    @Override
    public Integer updateType(Integer id,String typeName, String imageName) {
        Type type=new Type();
        type.setId(id);
        type.setTypename(typeName);
        type.setTImageURL("/images/typeImg/"+imageName+".png");
        return typeMapper.updateType(type);
    }

    @Override
    public Integer deleteType(Integer id) {
        return typeMapper.deleteType(id);
    }

    @Override
    public List<Map<String,Object>> selectIdAndTypename() {
        return typeMapper.selectIdAndTy();
    }
}
