package com.happycommunity.user.dao;

import com.happycommunity.user.domain.UserDO;
import org.apache.ibatis.annotations.*;

/**
 * @author Danny
 * @Title: UserDAO
 * @Description:
 * @Created on 2018-11-27 11:04:10
 */
@Mapper
public interface UserDAO {

    @Select("select * from t_user where userName=#{userName}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "createTime",column = "createTime"),
            @Result(property = "updateTime",column = "updateTime"),
            @Result(property = "comment",column = "comment"),
            @Result(property = "userName",column = "userName"),
            @Result(property = "mobileNo",column = "mobileNo"),
            @Result(property = "password",column = "password"),
            @Result(property = "email",column = "email")
    })
    UserDO findByUserName(@Param("userName") String userName);

}
