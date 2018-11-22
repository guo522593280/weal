package com.weal.storage.entity;

import javax.persistence.*;

public class Bookmakers {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 博彩公司名称
     */
    @Column(name = "BOOK_NAME")
    private String bookName;

    /**
     * 博彩公司名称拼音
     */
    @Column(name = "BOOK_NAME_PY")
    private String bookNamePy;

    /**
     * 菠菜公司类型 0普通 1主流公司 2交易所
     */
    @Column(name = "BOOK_TYPE")
    private Integer bookType;

    /**
     * 国家
     */
    @Column(name = "NATION")
    private String nation;

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
     * 获取博彩公司名称
     *
     * @return BOOK_NAME - 博彩公司名称
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * 设置博彩公司名称
     *
     * @param bookName 博彩公司名称
     */
    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    /**
     * 获取博彩公司名称拼音
     *
     * @return BOOK_NAME_PY - 博彩公司名称拼音
     */
    public String getBookNamePy() {
        return bookNamePy;
    }

    /**
     * 设置博彩公司名称拼音
     *
     * @param bookNamePy 博彩公司名称拼音
     */
    public void setBookNamePy(String bookNamePy) {
        this.bookNamePy = bookNamePy == null ? null : bookNamePy.trim();
    }

    /**
     * 获取菠菜公司类型 0普通 1主流公司 2交易所
     *
     * @return BOOK_TYPE - 菠菜公司类型 0普通 1主流公司 2交易所
     */
    public Integer getBookType() {
        return bookType;
    }

    /**
     * 设置菠菜公司类型 0普通 1主流公司 2交易所
     *
     * @param bookType 菠菜公司类型 0普通 1主流公司 2交易所
     */
    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }

    /**
     * 获取国家
     *
     * @return NATION - 国家
     */
    public String getNation() {
        return nation;
    }

    /**
     * 设置国家
     *
     * @param nation 国家
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }
}