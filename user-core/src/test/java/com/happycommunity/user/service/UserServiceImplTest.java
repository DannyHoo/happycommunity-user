package com.happycommunity.user.service;

import com.happycommunity.framework.common.dto.user.UserDTO;
import com.happycommunity.uesr.service.UserService;
import com.happycommunity.user.AbstractTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Danny
 * @Title: UserServiceImplTest
 * @Description:
 * @Created on 2018-11-27 15:14:43
 */
public class UserServiceImplTest extends AbstractTest {

    @Autowired
    private UserService userService;

    @Test
    public void findByUserNameTest(){
        UserDTO userDTO=userService.findUserByUserName("Danny");
        System.out.println(userDTO.getUserName());
    }
}
