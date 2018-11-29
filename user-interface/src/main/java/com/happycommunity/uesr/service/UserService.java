package com.happycommunity.uesr.service;

import com.happycommunity.framework.common.model.dto.user.UserDTO;

/**
 * @author Danny
 * @Title: UserService
 * @Description:
 * @Created on 2018-11-26 15:16:00
 */
public interface UserService {

    public UserDTO findByUserName(String userName);

    public UserDTO saveUser(UserDTO userDTO);

}
