package com.tuling.config.role.service;


import com.tuling.config.role.entity.SysUser;

public interface ISysUserService {

    SysUser getByUsername(String username);
}
