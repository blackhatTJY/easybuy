package com.awsl.easybuy.mapper;

import com.awsl.easybuy.bean.User;
import com.awsl.easybuy.common.BaseDao;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import org.springframework.stereotype.Repository;


/**
 * @author tjy
 */
@Mapper
public interface UserMapper extends BaseDao<User> {

    User findByUserNameAndPassword(@Param("loginName")String loginName, @Param("password")String password);
}
