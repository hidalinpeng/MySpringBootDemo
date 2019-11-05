package com.lzp.springdemo.modules.sys.service;

import com.lzp.springdemo.modules.sys.entity.Role;
import com.lzp.springdemo.modules.sys.entity.User;

import java.util.Map;

/**
 * @program: springdemo
 * @description
 * @author: lzp
 * @create: 2019-11-05 10:27
 **/
public interface ILoginService {

    /**
     * 添加用户
     * @param map
     * @return
     */
    User addUser(Map<String, Object> map);

    /**
     * 添加角色
     * @param map
     * @return
     */
    Role addRole(Map<String, Object> map);

    /**
     * 根据用户名查询用户
     * @param name
     * @return
     */
    User findByName(String name);

}
