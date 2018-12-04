package com.happycommunity.user.service;

import com.alibaba.fastjson.JSON;
import com.happycommunity.framework.common.model.dto.user.UserDTO;
import com.happycommunity.framework.common.model.result.ServiceResult;
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
        ServiceResult<UserDTO> userDTO=userService.findByUserName("Danny");
        System.out.println(JSON.toJSONString(userDTO));
    }


}
