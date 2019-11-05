package com.lzp.springdemo.modules.sys.controller;

import com.lzp.springdemo.common.utils.R;
import com.lzp.springdemo.modules.sys.entity.Role;
import com.lzp.springdemo.modules.sys.entity.User;
import com.lzp.springdemo.modules.sys.service.ILoginService;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program: springdemo
 * @description
 * @author: lzp
 * @create: 2019-11-05 11:48
 **/
@RestController
public class LgoinController {
    @Autowired
    private ILoginService loginService;

    /**
     * 退出时get请求
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    /**
     * post登录
     * @param map
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public R login(@RequestBody Map map){
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                map.get("username").toString(),
                map.get("password").toString());
        //进行验证，这里可以捕获异常，然后返回对应信息
        try {
            subject.login(usernamePasswordToken);
        } catch (AuthenticationException e) {
            return R.error("用户名或密码错误,请重新输入");
        }
        return R.ok();
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    /**
     *登出
     */
    @RequestMapping(value = "/logout")
    public String logout(){
        return "logout";
    }

    /**
     *错误页面展示
     */
    @RequestMapping(value = "/error",method = RequestMethod.POST)
    public String error(){
        return "error ok!";
    }

    /**
     *数据初始化
     */
    @RequestMapping(value = "/addUser")
    public String addUser(@RequestBody Map<String,Object> map){
        User user = loginService.addUser(map);
        return "addUser is ok! \n" + user;
    }

    /**
     *角色初始化
     */
    @RequestMapping(value = "/addRole")
    public String addRole(@RequestBody Map<String,Object> map){
        Role role = loginService.addRole(map);
        return "addRole is ok! \n" + role;
    }

    /**
     * 注解的使用
     * @return
     */
    @RequiresRoles("admin")
    @RequiresPermissions("create")
    @RequestMapping(value = "/create")
    public String create(){
        return "Create success!";
    }
}
