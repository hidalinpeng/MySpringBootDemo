package com.lzp.springdemo.modules.sys.service.impl;

import com.lzp.springdemo.modules.sys.entity.Permission;
import com.lzp.springdemo.modules.sys.entity.Role;
import com.lzp.springdemo.modules.sys.entity.User;
import com.lzp.springdemo.modules.sys.repository.RoleRepository;
import com.lzp.springdemo.modules.sys.repository.UserRepository;
import com.lzp.springdemo.modules.sys.service.ILoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

/**
 * @program: springdemo
 * @description
 * @author: lzp
 * @create: 2019-11-05 10:27
 *
 **/
@Service
@Transactional
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    /**
     *添加用户
     */
    @Override
    public User addUser(Map<String, Object> map) {
        User user = new User();
        user.setName(map.get("username").toString());
        user.setPassword(Integer.valueOf(map.get("password").toString()));
        userRepository.save(user);
        return user;
    }

    /**
     *添加角色
     */
    @Override
    public Role addRole(Map<String, Object> map) {
        User user = userRepository.findOne(Long.valueOf(map.get("userId").toString()));

        Role role = new Role();
        role.setRoleName(map.get("roleName").toString());
        role.setUser(user);
        Permission permission1 = new Permission();
        permission1.setPermission("create");
        permission1.setRole(role);
        Permission permission2 = new Permission();
        permission2.setPermission("update");
        permission2.setRole(role);
        List<Permission> permissions = new ArrayList<Permission>();
        permissions.add(permission1);
        permissions.add(permission2);
        role.setPermissions(permissions);
        roleRepository.save(role);
        return role;
    }

    /**
     *根据名称查询
     */
    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }





}
