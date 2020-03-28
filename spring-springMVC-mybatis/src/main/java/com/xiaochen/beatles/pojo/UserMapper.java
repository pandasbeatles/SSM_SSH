package com.xiaochen.beatles.pojo;


import org.apache.ibatis.annotations.*;

import javax.xml.registry.infomodel.User;
import java.util.List;

public interface UserMapper {

  
   /**
     * @Author xiaochen
     * @Description 
     * @Date 0:01 2020/3/29
     * @Param []
     * @return java.util.List<javax.xml.registry.infomodel.User> 
     **/
    @Results(
            id = "id", value = {
            @Result(property = "username", column = "username"),
            @Result(property = "sex", column = "sex")
    })
    @Select(value = "select *from user ")
    List<User> selectByExample();

    /**
      * @Author xiaochen
      * @Description 
      * @Date 0:04 2020/3/29
      * @Param [id]
      * @return javax.xml.registry.infomodel.User 
      **/
    @Results({
            @Result(property = "username", column = "username"),
            @Result(property = "sex", column = "sex")
    })
    @Select(value = "select *from user where id=#{id}")
    User selectByPrimaryKey(String id);

}