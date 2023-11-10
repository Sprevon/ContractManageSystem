package com.tinklebi.cms.exception;

import com.tinklebi.cms.utils.HTTPResult;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Comments 系统报错拦截器
 * @Author LeonBwChen
 * @Date 2023/10/18 19:50
 */
@ControllerAdvice(basePackages = "com.tinklebi.cms.ht.controller")
public class CmsExceptionController {
    @ExceptionHandler(value = Exception.class)
    public HTTPResult handleException(){
        return HTTPResult.buildFault();
    }
}
