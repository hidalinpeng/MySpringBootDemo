package com.lzp.springdemo.modules.sys.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * @program: springdemo
 * @description
 * @author: lzp
 * @create: 2019-11-05 10:26
 **/
@NoRepositoryBean
public interface BaseRepository<T,I extends Serializable> extends PagingAndSortingRepository<T,I>,
        JpaSpecificationExecutor<T> {

}
