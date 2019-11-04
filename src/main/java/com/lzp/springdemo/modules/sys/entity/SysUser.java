package com.lzp.springdemo.modules.sys.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @program: springdemo
 * @description 系统用户
 * @author: lzp
 * @create: 2019-11-04 11:26
 **/
@Entity
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1853552247903943936L;
    /**
     * 用户id
     * bigint(20) NOT NULL
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    /**
     *用户名
     * varchar(50) NOT NULL用户名
     */
    private String username;

    /**
     * 密码
     * varchar(100) NULL密码
     */
    private String password;

    /**
     * 盐值
     * varchar(20) NULL盐
     */
    private String salt;
    /**
     * 邮箱
     * varchar(100) NULL邮箱
     */
    private String email;
    /**
     * 手机号
     * varchar(100) NULL手机号
     */
    private String mobile;
    /**
     * 用户状态
     * tinyint(4) NULL状态 0：禁用 1：正常
     */
    private Integer status;
    /**
     * 创建者ID
     * bigint(20) NULL创建者ID
     */
    private Long createUserId;
    /**
     * 创建时间
     * datetime NULL创建时间
     */
    private Date createTime;

    public SysUser() {
    }

    public SysUser(String username, String password, String salt,
            String email, String mobile, Integer status, Long createUserId, Date createTime) {
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.mobile = mobile;
        this.status = status;
        this.createUserId = createUserId;
        this.createTime = createTime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getuserId() {
        return userId;
    }

    public void setuserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getcreateTime() {
        return createTime;
    }

    public void setcreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
