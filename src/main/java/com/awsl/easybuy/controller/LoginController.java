package com.awsl.easybuy.controller;

import com.awsl.easybuy.bean.User;
import com.awsl.easybuy.common.BaseController;
import com.awsl.easybuy.mapper.UserMapper;
import com.awsl.easybuy.service.UserService;
import com.awsl.easybuy.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tjy
 * 登录相关
 */
@Controller

public class LoginController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "homepage")
    public String homePage() {
        return "Index";
    }

    @RequestMapping("/ulogin")
    public String login() {
        return "Login";
    }


    @RequestMapping("/ures")
    public String res() {

        return "Regist";
    }

    /**
     * 执行普通用户注册
     */
    @RequestMapping("/toRes")
    public String toRes(User u) {
        userService.insert(u);
        return "Login";
    }


    @RequestMapping("/utoLogin")


    public String utoLogin(String loginName,String password, HttpServletRequest request) {

        User byEntity = userService.login(loginName,password);
        if(byEntity==null){
            return "redirect:Login";
        }else {
            request.getSession().setAttribute("tuype",1);
            request.getSession().setAttribute("loginName",byEntity.getLoginName());
            request.getSession().setAttribute("id",byEntity.getId());
            return "redirect:uIndex";
        }
    }


    @RequestMapping("managlogin")
    public String mlogin(){
        return "managLogin";
    }


    @RequestMapping("tomLogin")
    public String toLogin(String loginName,String password, HttpServletRequest request){
        User byEntity = userService.login(loginName,password);
        if(byEntity.getType()==1){
            request.getSession().setAttribute(Consts.USER,byEntity);
            return "Manage";
        }



        return "view";
    }

        /**前端用户退出*/
        @RequestMapping("/uTui")
        public String uTui (HttpServletRequest request){
            HttpSession session = request.getSession();
            session.invalidate();
            return "redirect:Index";
        }
        /**
         * 前端首页
         */
        @RequestMapping("/uIndex")
        public String index ()
        {
            return "Index";
        }
    }


