package com.xiaochen.beatles.mapper;


import com.xiaochen.beatles.pojo.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonMapper {

    /**
     * 添加员工
     *
     * @param person
     * @return
     */
    @Insert(value = "INSERT INTO user (pname,psex,page)" + "VALUE (#{pname}, #{psex},#{page}")
    int insert(Person person);

    /**
     * @return com.xiaochen.beatles.pojo.Person
     * @Author xiaochen
     * @Description
     * @Date 23:05 2020/3/28
     * @Param [pid]
     **/

    @Results({
            @Result(id = true, column = "pid", property = "pid"),
            @Result(column = "pname", property = "pname"),
            @Result(column = "psex", property = "psex"),
            @Result(column = "page", property = "page")
    })
    @Select("select * from person where pid = #{pid}")
    public Person getPersonById(int pid);

    /**
     * @return com.xiaochen.beatles.pojo.Person
     * @Author xiaochen
     * @Description
     * @Date 23:05 2020/3/28
     * @Param []
     **/
    @Results(
            id = "pid", value = {
            @Result(column = "pname", property = "pname"),
            @Result(column = "psex", property = "psex"),
            @Result(column = "page", property = "page")
    })
    @Select("select * from person ")
    public List<Person> getPersons();
}