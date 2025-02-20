package com.example.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.admin.entity.SysPermission;
import com.example.common.core.entity.PermissionEntityVO;

import java.util.List;

public interface SysPermissionService extends IService<SysPermission> {

    void updateSysPermission(List<PermissionEntityVO> permission);
}
