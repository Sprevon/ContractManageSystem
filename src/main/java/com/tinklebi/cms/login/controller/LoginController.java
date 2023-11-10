package com.tinklebi.cms.login.controller;

import com.tinklebi.cms.login.entity.vo.CmsLogin;
import com.tinklebi.cms.login.entity.vo.CmsLogout;
import com.tinklebi.cms.login.service.LoginService;
import com.tinklebi.cms.utils.HTTPResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/16 16:07
 */
@Controller
@RequestMapping("/account")
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * 登录
     * @param request
     * @param response
     * @param cmsLogin
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public HTTPResult login(HttpServletRequest request, HttpServletResponse response, @RequestBody CmsLogin cmsLogin){
        return loginService.login(cmsLogin);
    }

    /**
     * 登出
     * @param request
     * @param response
     * @param cmsLogout
     * @return
     */
    @RequestMapping("/logout")
    @ResponseBody
    public HTTPResult logout(HttpServletRequest request, HttpServletResponse response, @RequestBody CmsLogout cmsLogout){
        return loginService.logout(cmsLogout);
    }
}
