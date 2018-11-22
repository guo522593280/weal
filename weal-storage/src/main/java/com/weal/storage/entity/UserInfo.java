package com.weal.storage.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo {
    /**
     * 用户id
     */
    @Id
    @Column(name = "PKID")
    private Integer pkid;

    /**
     * 主手机号 可作为登录账号
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 座机
     */
    @Column(name = "TELEPHONE")
    private String telephone;

    /**
     * 邮箱
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 头像（店铺图标）
     */
    @Column(name = "HEAD_PORTRAIT")
    private String headPortrait;

    /**
     * 账号
     */
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;

    /**
     * 用户密码
     */
    @Column(name = "PASS_WORD")
    private String passWord;

    /**
     * 昵称（店铺名称）唯一
     */
    @Column(name = "NICK_NAME")
    private String nickName;

    /**
     * 昵称（拼音）
     */
    @Column(name = "NICK_NAME_PY")
    private String nickNamePy;

    /**
     * 年龄
     */
    @Column(name = "AGE")
    private Integer age;

    /**
     * 性别 0女 1男
     */
    @Column(name = "SEX")
    private Integer sex;

    /**
     * 生日
     */
    @Column(name = "BIRTHDAY")
    private Date birthday;

    /**
     * 地址（店铺地址）
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 真实姓名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 身份证号
     */
    @Column(name = "ID_CARD_NO")
    private String idCardNo;

    /**
     * 个人说明
     */
    @Column(name = "AUTOGRAPH")
    private String autograph;

    /**
     * 最后一次登录时间
     */
    @Column(name = "LAST_LOGIN_DATE")
    private Date lastLoginDate;

    /**
     * 最后登录IP地址
     */
    @Column(name = "LAST_LOGIN_IP")
    private String lastLoginIp;

    /**
     * 0是普通 1是推单人 2是店长
     */
    @Column(name = "USER_TYPE")
    private Integer userType;

    /**
     * 状态 0正常 1登录异常 2冻结 3删除
     */
    @Column(name = "USER_STATUS")
    private Integer userStatus;

    /**
     * 修改日期
     */
    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    /**
     * 修改人
     */
    @Column(name = "UPDATE_BY")
    private Integer updateBy;

    /**
     * 邀请人
     */
    @Column(name = "INVITE_BY")
    private Integer inviteBy;

    /**
     * 邀请日期
     */
    @Column(name = "INVITE_DATE")
    private Date inviteDate;

    /**
     * 创建日期
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 获取用户id
     *
     * @return PKID - 用户id
     */
    public Integer getPkid() {
        return pkid;
    }

    /**
     * 设置用户id
     *
     * @param pkid 用户id
     */
    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    /**
     * 获取主手机号 可作为登录账号
     *
     * @return PHONE - 主手机号 可作为登录账号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置主手机号 可作为登录账号
     *
     * @param phone 主手机号 可作为登录账号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取座机
     *
     * @return TELEPHONE - 座机
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置座机
     *
     * @param telephone 座机
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * 获取邮箱
     *
     * @return EMAIL - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取头像（店铺图标）
     *
     * @return HEAD_PORTRAIT - 头像（店铺图标）
     */
    public String getHeadPortrait() {
        return headPortrait;
    }

    /**
     * 设置头像（店铺图标）
     *
     * @param headPortrait 头像（店铺图标）
     */
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    /**
     * 获取账号
     *
     * @return ACCOUNT_NUMBER - 账号
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 设置账号
     *
     * @param accountNumber 账号
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber == null ? null : accountNumber.trim();
    }

    /**
     * 获取用户密码
     *
     * @return PASS_WORD - 用户密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置用户密码
     *
     * @param passWord 用户密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    /**
     * 获取昵称（店铺名称）唯一
     *
     * @return NICK_NAME - 昵称（店铺名称）唯一
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称（店铺名称）唯一
     *
     * @param nickName 昵称（店铺名称）唯一
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取昵称（拼音）
     *
     * @return NICK_NAME_PY - 昵称（拼音）
     */
    public String getNickNamePy() {
        return nickNamePy;
    }

    /**
     * 设置昵称（拼音）
     *
     * @param nickNamePy 昵称（拼音）
     */
    public void setNickNamePy(String nickNamePy) {
        this.nickNamePy = nickNamePy == null ? null : nickNamePy.trim();
    }

    /**
     * 获取年龄
     *
     * @return AGE - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取性别 0女 1男
     *
     * @return SEX - 性别 0女 1男
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别 0女 1男
     *
     * @param sex 性别 0女 1男
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取生日
     *
     * @return BIRTHDAY - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取地址（店铺地址）
     *
     * @return ADDRESS - 地址（店铺地址）
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址（店铺地址）
     *
     * @param address 地址（店铺地址）
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取真实姓名
     *
     * @return USER_NAME - 真实姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置真实姓名
     *
     * @param userName 真实姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取身份证号
     *
     * @return ID_CARD_NO - 身份证号
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * 设置身份证号
     *
     * @param idCardNo 身份证号
     */
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    /**
     * 获取个人说明
     *
     * @return AUTOGRAPH - 个人说明
     */
    public String getAutograph() {
        return autograph;
    }

    /**
     * 设置个人说明
     *
     * @param autograph 个人说明
     */
    public void setAutograph(String autograph) {
        this.autograph = autograph == null ? null : autograph.trim();
    }

    /**
     * 获取最后一次登录时间
     *
     * @return LAST_LOGIN_DATE - 最后一次登录时间
     */
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * 设置最后一次登录时间
     *
     * @param lastLoginDate 最后一次登录时间
     */
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /**
     * 获取最后登录IP地址
     *
     * @return LAST_LOGIN_IP - 最后登录IP地址
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 设置最后登录IP地址
     *
     * @param lastLoginIp 最后登录IP地址
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * 获取0是普通 1是推单人 2是店长
     *
     * @return USER_TYPE - 0是普通 1是推单人 2是店长
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置0是普通 1是推单人 2是店长
     *
     * @param userType 0是普通 1是推单人 2是店长
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取状态 0正常 1登录异常 2冻结 3删除
     *
     * @return USER_STATUS - 状态 0正常 1登录异常 2冻结 3删除
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * 设置状态 0正常 1登录异常 2冻结 3删除
     *
     * @param userStatus 状态 0正常 1登录异常 2冻结 3删除
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 获取修改日期
     *
     * @return UPDATE_DATE - 修改日期
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置修改日期
     *
     * @param updateDate 修改日期
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取修改人
     *
     * @return UPDATE_BY - 修改人
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置修改人
     *
     * @param updateBy 修改人
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取邀请人
     *
     * @return INVITE_BY - 邀请人
     */
    public Integer getInviteBy() {
        return inviteBy;
    }

    /**
     * 设置邀请人
     *
     * @param inviteBy 邀请人
     */
    public void setInviteBy(Integer inviteBy) {
        this.inviteBy = inviteBy;
    }

    /**
     * 获取邀请日期
     *
     * @return INVITE_DATE - 邀请日期
     */
    public Date getInviteDate() {
        return inviteDate;
    }

    /**
     * 设置邀请日期
     *
     * @param inviteDate 邀请日期
     */
    public void setInviteDate(Date inviteDate) {
        this.inviteDate = inviteDate;
    }

    /**
     * 获取创建日期
     *
     * @return CREATE_DATE - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}