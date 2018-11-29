package com.happycommunity.user.service;


import com.happycommunity.framework.common.model.dto.user.UserDTO;
import com.happycommunity.framework.core.util.BeanUtil;
import com.happycommunity.uesr.service.UserService;
import com.happycommunity.user.dao.UserDAO;
import com.happycommunity.user.domain.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Danny
 * @Title: UserServiceImpl
 * @Description:
 * @Created on 2018-11-26 20:11:32
 */
@Service("userService")
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDTO findByUserName(String userName) {
        UserDO userDO=userDAO.findByUserName(userName);
        return BeanUtil.convertIgnoreNullProperty(userDO, UserDTO.class);
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }


}
