package com.happycommunity.uesr.service;

import com.happycommunity.framework.common.model.dto.user.UserDTO;
import com.happycommunity.framework.common.model.result.ServiceResult;

/**
 * @author Danny
 * @Title: UserService
 * @Description:
 * @Created on 2018-11-26 15:16:00
 */
public interface UserService {

    public ServiceResult<UserDTO> findByUserName(String userName);

    public ServiceResult<UserDTO> saveUser(UserDTO userDTO);

}
