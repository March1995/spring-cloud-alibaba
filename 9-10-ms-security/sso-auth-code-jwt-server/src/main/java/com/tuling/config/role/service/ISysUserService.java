package com.tuling.config.role.service;


import com.tuling.config.role.entity.SysUser;

/**
 * Created by wyb on 2019/12/20.
 */
public interface ISysUserService {

    SysUser getByUsername(String username);
}
