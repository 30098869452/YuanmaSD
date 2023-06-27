package com.example.demo.controller;

import com.example.demo.pojo.Type;
import com.example.demo.pojo.entity.RespCode;
import com.example.demo.pojo.entity.RespData;
import com.example.demo.pojo.entity.RespDataAndCount;
import com.example.demo.service.TypeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Description：
 * @Author：李康
 * @Date：2023/6/21 16:30
 *
 *
 * 注释:@RequesParam(value= "数据名",required=true):接受请求数据名的参数将其值给后面的形参
 * value:指定请求中的数据名称
 * requied:mo
 */
@RestController
@RequestMapping("/type")
//所有的请求都可以经过此路径路径不可重合
public class TypeController {
    @Resource
    TypeService typeService;
    @GetMapping("/getByPage")//@RequestMapping(value="/getByPage",method={RequestMethod.GET})
    public RespDataAndCount showTypeByPage(@RequestParam(value = "typeName",required = false) String typeName, @RequestParam("page")  Integer currentPage, @RequestParam("limit")  Integer pageSize)
{
    List<Type> typeList = typeService.findTypeByPage(typeName, (currentPage - 1) * pageSize, pageSize);
    Integer count = typeService.findTypeCount(typeName);
    if(typeList==null||count==null){
        return new RespDataAndCount(RespCode.ERROR_2);
    }if(typeList.size()==0||count==0){
        return new RespDataAndCount(RespCode.ERROR_3);
    }
    return  new RespDataAndCount(RespCode.SUCCESS,typeList,count);
}
    @PostMapping("/addType")
    public RespData addType(@RequestParam("typeName") String typeName,
                            @RequestParam("imageName") String imageName
                            ) {
        Integer integer = typeService.addType(typeName, imageName);
        if (integer > 0&&integer!=null)
        {
            return new RespData(RespCode.SUCCESS);
        }
        return new RespData(RespCode.ERROR_4);
    }
    @PutMapping("/updateState")
    public RespData updtateState(@RequestParam("id") Integer id,
                                 @RequestParam("typeState") Integer typeState){
        if(typeService.updateState(id,typeState)>0){
            return  new RespData(RespCode.SUCCESS);
        }
        return  new RespData(RespCode.ERROR_5);
    }

    @PutMapping("/updateType")
    public RespData updateType(@RequestParam("id") Integer id,@RequestParam("typeName") String typeName,
                               @RequestParam("imageName") String imageName){
        Integer integer = typeService.updateType(id, typeName, imageName);
        if(integer>0){
            return  new RespData(RespCode.SUCCESS);
        }
        return new RespData(RespCode.ERROR_5);

    }
    //更具id删除数据
    @DeleteMapping("/delType/{id}")
    public RespData deleteType(@PathVariable("id") Integer id){
        if(typeService.deleteType(id)>0){

            return new RespData(RespCode.SUCCESS);
        }
        return  new RespData(RespCode.ERROR_6);
    }

    @GetMapping("/getIdAndName")
    public RespData selectIdAndTypeName(){
        List<Map<String, Object>> maps = typeService.selectIdAndTypename();

        if(maps.size()==0||maps==null){
            return new RespData(RespCode.ERROR_2);
        }
        return new RespData(RespCode.SUCCESS,maps);
    }

}
