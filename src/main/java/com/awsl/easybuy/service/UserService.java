package com.awsl.easybuy.service;

import com.awsl.easybuy.bean.User;
import com.awsl.easybuy.common.BaseService;
import com.awsl.easybuy.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tjy
 */

public interface UserService extends BaseService<User> {
    User login(String loginName, String password);
}
