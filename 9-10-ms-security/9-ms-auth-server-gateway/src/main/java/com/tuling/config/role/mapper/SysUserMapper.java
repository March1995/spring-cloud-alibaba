package com.tuling.config.role.mapper;


import com.tuling.config.role.entity.SysUser;

public interface SysUserMapper {

    SysUser findByUserName(String userName);
}
