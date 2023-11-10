package com.tinklebi.cms.exception;

import com.tinklebi.cms.utils.HTTPResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Comments 系统报错拦截器
 * @Author LeonBwChen
 * @Date 2023/10/18 19:49
 */
@ControllerAdvice(basePackages = "com.tinklebi.cms.login.controller")
public class LoginExceptionController {
    @ExceptionHandler(value = Exception.class)
    public HTTPResult exceptionHandler(){
        return HTTPResult.buildFault();
    }
}
