/*
package com.lzp.springdemo.modules.sys.controller;

import com.lzp.springdemo.common.utils.R;
import com.lzp.springdemo.modules.sys.repository.SysUserRepository;
import com.lzp.springdemo.modules.sys.entity.SysUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

*/
/**
 * @program: springdemo
 * @description 系统用户服务控制层
 * @author: lzp
 * @create: 2019-11-04 11:14
 **//*


@RestController
public class SysUserController {
    @Autowired
    SysUserRepository sysUserRepository;

    @RequestMapping(value = "/login", method = { RequestMethod.POST})
    public R loginRequest(@RequestParam("data") String data){

        return R.ok();
    }


    @GetMapping("/list")
    public List<SysUser> sysUserList(){
        List<SysUser> userList = sysUserRepository.findAll();
        return userList;
    }

}
*/
