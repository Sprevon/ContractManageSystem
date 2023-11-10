package com.tinklebi.cms.login.service;

import com.tinklebi.cms.utils.HTTPResult;
import com.tinklebi.cms.login.entity.vo.CmsLogin;
import com.tinklebi.cms.login.entity.vo.CmsLogout;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/16 16:07
 */
public interface LoginService {
    /**
     * 登录
     * @param cmsLogin
     * @return
     */
    HTTPResult login(CmsLogin cmsLogin);

    /**
     * 登出
     * @param cmsLogout
     * @return
     */
    HTTPResult logout(CmsLogout cmsLogout);
}
