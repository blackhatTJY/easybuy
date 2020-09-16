package com.awsl.easybuy.service.imp;

import com.awsl.easybuy.bean.User;
import com.awsl.easybuy.common.BaseDao;
import com.awsl.easybuy.common.BaseServiceImpl;
import com.awsl.easybuy.mapper.LoginMapper;
import com.awsl.easybuy.mapper.UserMapper;
import com.awsl.easybuy.service.UserService;
import com.awsl.easybuy.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author tjy
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
@Autowired
private LoginMapper loginMapper;
@Autowired
private UserMapper userMapper;

    @Override
    public BaseDao<User> getBaseDao() {
        return userMapper;
    }

    @Override
    public User login(String loginName, String password) {
        return loginMapper.findByUserNameAndPassword(loginName, password);
    }
}
