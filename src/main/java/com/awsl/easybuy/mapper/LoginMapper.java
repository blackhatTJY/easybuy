package com.awsl.easybuy.mapper;

import com.awsl.easybuy.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

@Mapper
public interface LoginMapper {
    //根据用户名和密码查找。mybatis中有多个参数时，需要使用@Param注解
    User findByUserNameAndPassword(@PathVariable("LoginName")String loginName, @PathVariable("password")String password);

}
