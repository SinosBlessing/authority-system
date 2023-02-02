package com.sinos.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sinos.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sinos.vo.query.RoleQueryVo;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author sinos
 * @since 2022-06-30
 */
public interface RoleService extends IService<Role> {
    /**
     * 根据用户查询角色列表
     *
     * @param page
     * @param roleQueryVo
     * @return
     */
    IPage<Role> findRoleListByUserId(IPage<Role> page, RoleQueryVo roleQueryVo);

    /**
     * 保存角色权限关系
     *
     * @param roleId
     * @param permissionIds
     * @return
     */
    boolean saveRolePermission(Long roleId, List<Long> permissionIds);

    /**
     * 检查角色是否被使用
     * @param id
     * @return
     */
    boolean hasRoleCount(Long id);

    /**
     * 删除角色
     * @param id
     * @return
     */
    boolean deleteRoleById(Long id);

    /**
     * 根据用户ID查询该用户拥有的角色ID
     * @param userId
     * @return
     */
    List<Long> findRoleIdByUserId(Long userId);
}
