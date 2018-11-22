package com.weal.storage.entity;

import javax.persistence.*;

@Table(name = "role_menu_relation")
public class RoleMenuRelation {
    /**
     * 角色ID
     */
    @Column(name = "ROLE_ID")
    private Integer roleId;

    /**
     * 权限ID
     */
    @Column(name = "MENU_ID")
    private Integer menuId;

    /**
     * 获取角色ID
     *
     * @return ROLE_ID - 角色ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取权限ID
     *
     * @return MENU_ID - 权限ID
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置权限ID
     *
     * @param menuId 权限ID
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}