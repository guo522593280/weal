package com.weal.storage.entity;

import javax.persistence.*;

public class Menu {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 菜单CODE
     */
    @Column(name = "MENU_CODE")
    private Integer menuCode;

    /**
     * 菜单名
     */
    @Column(name = "MENU_NAME")
    private String menuName;

    /**
     * 菜单url
     */
    @Column(name = "MENU_URL")
    private String menuUrl;

    /**
     * 主CODE
     */
    @Column(name = "PARENT_CODE")
    private Integer parentCode;

    /**
     * 菜单排序
     */
    @Column(name = "MENU_ORDER")
    private Integer menuOrder;

    /**
     * 类型：0 菜单 1 按钮
     */
    @Column(name = "MENU_TYPE")
    private Integer menuType;

    /**
     * 是否有效 1是 2否
     */
    @Column(name = "IS_VALID")
    private Integer isValid;

    /**
     * api地址
     */
    @Column(name = "API_PATH")
    private String apiPath;

    /**
     * 获取主键ID
     *
     * @return PKID - 主键ID
     */
    public Integer getPkid() {
        return pkid;
    }

    /**
     * 设置主键ID
     *
     * @param pkid 主键ID
     */
    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    /**
     * 获取菜单CODE
     *
     * @return MENU_CODE - 菜单CODE
     */
    public Integer getMenuCode() {
        return menuCode;
    }

    /**
     * 设置菜单CODE
     *
     * @param menuCode 菜单CODE
     */
    public void setMenuCode(Integer menuCode) {
        this.menuCode = menuCode;
    }

    /**
     * 获取菜单名
     *
     * @return MENU_NAME - 菜单名
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置菜单名
     *
     * @param menuName 菜单名
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 获取菜单url
     *
     * @return MENU_URL - 菜单url
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * 设置菜单url
     *
     * @param menuUrl 菜单url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * 获取主CODE
     *
     * @return PARENT_CODE - 主CODE
     */
    public Integer getParentCode() {
        return parentCode;
    }

    /**
     * 设置主CODE
     *
     * @param parentCode 主CODE
     */
    public void setParentCode(Integer parentCode) {
        this.parentCode = parentCode;
    }

    /**
     * 获取菜单排序
     *
     * @return MENU_ORDER - 菜单排序
     */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /**
     * 设置菜单排序
     *
     * @param menuOrder 菜单排序
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * 获取类型：0 菜单 1 按钮
     *
     * @return MENU_TYPE - 类型：0 菜单 1 按钮
     */
    public Integer getMenuType() {
        return menuType;
    }

    /**
     * 设置类型：0 菜单 1 按钮
     *
     * @param menuType 类型：0 菜单 1 按钮
     */
    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    /**
     * 获取是否有效 1是 2否
     *
     * @return IS_VALID - 是否有效 1是 2否
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * 设置是否有效 1是 2否
     *
     * @param isValid 是否有效 1是 2否
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
     * 获取api地址
     *
     * @return API_PATH - api地址
     */
    public String getApiPath() {
        return apiPath;
    }

    /**
     * 设置api地址
     *
     * @param apiPath api地址
     */
    public void setApiPath(String apiPath) {
        this.apiPath = apiPath == null ? null : apiPath.trim();
    }
}