package com.example.demo.mapper;

import com.example.demo.pojo.Type;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/21 14:17
 */
public interface TypeMapper {
    List<Type> qureyAllType();
    List<Type> queryTypeByPage(@Param("word") String typeName,@Param("start")  Integer startIndex,@Param("size")  Integer pageSize);

    Integer queryTypeCount(String typeName);
    Integer insertType(Type type);
    //修改奶茶类型的状态
    Integer updatestate(@Param("id") Integer id,@Param("state") Integer state);

    Integer updateType(Type type);

    Integer deleteType(Integer id);


    //方法二  Mysql返回的每一条语句都会返回为Map<String,Object>类型的集合
    //所以要用List返回接收    xml返回的typeresult类型为Map
    List<Map<String,Object>> selectIdAndTy();
    //List<Type> selectIdAndTy();

}
