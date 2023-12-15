package com.tinklebi.cms.ht.entity;

import lombok.Data;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/23 11:06
 */
@Data
public class UserInfo {
    /**
     * 用户编号
     */
    private Long userId;

    /**
     * 用户名称
     */
    private String userName;

    public void setUserId(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
//        this.userId = (Long) httpSession.getAttribute("userId");
        this.userId = 1L;
    }


    public void setUserIdByValue(Long userId) {
        this.userId = userId;
    }
}
