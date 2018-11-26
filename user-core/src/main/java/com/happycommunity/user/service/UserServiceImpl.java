package com.happycommunity.user.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.happycommunity.framework.common.dto.user.UserDTO;
import com.happycommunity.uesr.service.UserService;

/**
 * @author Danny
 * @Title: UserServiceImpl
 * @Description:
 * @Created on 2018-11-26 20:11:32
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService{
    @Override
    public UserDTO findUserByUserName(String userName) {
        return new UserDTO().setUserName("Danny");
    }
}
