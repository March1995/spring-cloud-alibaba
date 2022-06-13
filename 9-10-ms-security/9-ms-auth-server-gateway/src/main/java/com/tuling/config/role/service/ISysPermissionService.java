package com.tuling.config.role.service;


import com.tuling.config.role.entity.SysPermission;

import java.util.List;

public interface ISysPermissionService {

    List<SysPermission> findByUserId(Integer userId);
}
