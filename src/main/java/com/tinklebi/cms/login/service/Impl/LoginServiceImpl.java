package com.tinklebi.cms.login.service.Impl;

import com.tinklebi.cms.utils.HTTPResult;
import com.tinklebi.cms.login.entity.vo.CmsLogin;
import com.tinklebi.cms.login.entity.vo.CmsLogout;
import com.tinklebi.cms.login.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/16 16:07
 */
@Service
public class LoginServiceImpl implements LoginService {
    /**
     * 登录
     *
     * @param cmsLogin
     * @return
     */
    @Override
    public HTTPResult login(CmsLogin cmsLogin) {
        return null;
    }

    /**
     * 登出
     *
     * @param cmsLogout
     * @return
     */
    @Override
    public HTTPResult logout(CmsLogout cmsLogout) {
        return null;
    }
}
