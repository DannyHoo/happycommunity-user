package com.happycommunity.user.service;


import com.happycommunity.framework.common.model.dto.user.UserDTO;
import com.happycommunity.framework.common.model.enums.ResultStatusEnum;
import com.happycommunity.framework.common.model.result.ServiceResult;
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
    public ServiceResult<UserDTO> findByUserName(String userName) {
        UserDO userDO = userDAO.findByUserName(userName);
        UserDTO userDTO=BeanUtil.convertIgnoreNullProperty(userDO, UserDTO.class);
        return new ServiceResult<UserDTO>(ResultStatusEnum.SUCCESS,userDTO);
    }

    @Override
    public ServiceResult<UserDTO>  saveUser(UserDTO userDTO) {
        UserDO userDO = BeanUtil.convertIgnoreNullProperty(userDTO, UserDO.class);
        int counts = userDAO.insertUserDO(userDO);
        if (counts == 1 && userDO.getId() != null) {
            UserDTO userDTOFound=BeanUtil.convertIgnoreNullProperty(userDO, UserDTO.class);
            return new ServiceResult<UserDTO>(ResultStatusEnum.SUCCESS,userDTOFound);
        }
        return new ServiceResult<UserDTO>(ResultStatusEnum.FAILURE);
    }

}
