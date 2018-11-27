package com.happycommunity.user.domain;

import com.happycommunity.framework.common.domain.BaseDO;

/**
 * @author Danny
 * @Title: UserDO
 * @Description:
 * @Created on 2018-11-27 11:03:57
 */
public class UserDO extends BaseDO{

    private String userName;
    private String mobileNo;
    private String password;
    private String email;

    public String getUserName() {
        return userName;
    }

    public UserDO setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public UserDO setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDO setEmail(String email) {
        this.email = email;
        return this;
    }
}
