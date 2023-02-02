package com.sinos.vo;

import com.sinos.entity.Permission;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 角色权限菜单数据回显
 */
@Data
public class RolePermissionVo {
    /**
     * 菜单数据
     */
    private List<Permission> permissionList = new ArrayList<Permission>();
    /**
     * 该角色原有分配的菜单数据
     */
    private Object[] checkList;
}
