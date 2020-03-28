package com.xiaochen.beatles.mapper;


import com.xiaochen.beatles.pojo.Users;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UsersMapper {
    /**
     * 添加
     *
     * @param users
     * @return
     */
    @Insert(value = "INSERT INTO card (uname)" + "VALUE (#{uname}")
    int insert(Users users);

    /**
     * 根据id得到用户：
     *
     * @param uid
     * @return
     */

    @Results({
            @Result(id = true, column = "uid", property = "uid"),
            @Result(column = "uname", property = "uname"),
    })
    @Select("select * from users where uid = #{uid}")
    public Users getUsersById(int uid);

    /**
     * @return com.xiaochen.beatles.pojo.Users
     * @Author xiaochen
     * @Description
     * @Date 23:04 2020/3/28
     * @Param []
     **/
    @Results(
            id = "uid", value = {
            @Result(column = "uname", property = "uname")
    })
    @Select("select * from users")
    public List<Users> getUsers();
}
