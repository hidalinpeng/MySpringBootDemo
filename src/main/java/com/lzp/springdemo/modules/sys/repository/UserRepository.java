package com.lzp.springdemo.modules.sys.repository;

import com.lzp.springdemo.modules.sys.entity.User;

/**
 * @program: springdemo
 * @description
 * @author: lzp
 * @create: 2019-11-05 10:26
 **/
public interface UserRepository extends BaseRepository<User,Long>{
        /**
         * 根据名字查询用户
         * @param name
         * @return
         */
        User findByName(String name);
}
