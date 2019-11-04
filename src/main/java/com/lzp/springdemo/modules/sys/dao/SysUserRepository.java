package com.lzp.springdemo.modules.sys.dao;

import com.lzp.springdemo.modules.sys.entity.SysUser;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: springdemo
 * @description
 * @author: lzp
 * @create: 2019-11-04 14:03
 **/
public interface SysUserRepository extends JpaRepository<SysUser,String> {

}
