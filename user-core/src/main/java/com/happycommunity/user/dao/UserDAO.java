package com.happycommunity.user.dao;

import com.happycommunity.user.domain.UserDO;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;

import java.util.List;

/**
 * @author Danny
 * @Title: UserDAO
 * @Description:
 * @Created on 2018-11-27 11:04:10
 */
@Mapper
public interface UserDAO {

    @Select("select * from t_user where userName=#{userName}")
    UserDO findByUserName(@Param("userName") String userName);


    @Insert("insert into t_user(userName,mobileNo,salt,password,email,realName,idCardNo) values (#{userName},#{mobileNo},#{salt},#{password},#{email},#{realName},#{idCardNo})")
    @SelectKey(before = false, keyProperty = "id", resultType = Long.class, statementType = StatementType.STATEMENT, statement = "SELECT LAST_INSERT_ID() AS id")
    int insertUserDO(UserDO userDO);

    @Insert({
            "<script>"
                    + "INSERT INTO t_user (userName,mobileNo,salt,password,email,realName,idCardNo) "
                    + "VALUES "
                    + "<foreach item='user' index='index' collection='userDOList' separator=','>"
                    + "(#{user.userName},#{user.mobileNo},#{user.salt},#{user.password},#{user.email},#{user.realName},#{user.idCardNo})"
                    + "</foreach>"
                    + "</script>"
    })
    int insertUserDOBatch(@Param("userDOList") List<UserDO> userDOList);
}
