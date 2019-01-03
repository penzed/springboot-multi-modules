package com.pinux.demo.jpa;

import com.pinux.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @return 
 * @Author pinux
 * @Description 
 * @Date 下午5:11 19-1-2
 * @Param 
 **/
public interface UserJPA extends
        JpaRepository<UserEntity, Long>,
        JpaSpecificationExecutor<UserEntity>,
        Serializable{
}
