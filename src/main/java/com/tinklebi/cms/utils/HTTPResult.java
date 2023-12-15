package com.tinklebi.cms.utils;

import lombok.Data;

//import java.io.Serial;
import java.io.Serializable;

import static com.tinklebi.cms.utils.Constants.*;


/**
 * @Comments 结果集合
 * @Author LeonBwChen
 * @Date 2023/10/18 18:55
 */
@Data
public class HTTPResult implements Serializable {

//    @Serial
    private static final long serialVersionUID = 8881935645035272968L;

    /**
     * 消息
     */
    private String message;
    /**
     * 代码
     */
    private int code;
    /**
     * 数量
     */
    private int total;
    /**
     * 数据
     */
    private Object data;
    //构造方法
    public HTTPResult(){
        this.message = Constants.MESSAGE_FAULT;
        this.code =  Constants.CODE_CLIENT_ERROR;
    }
    public HTTPResult(String message){
        this.message = message;
    }
    public HTTPResult(String message, int code){
        this(message);
        this.code = code;
    }
    public HTTPResult(String message, int code, Object data){
        this(message, code);
        this.data = data;
    }

    public HTTPResult(int total, Object data) {
        this.total = total;
        this.data = data;
    }

    //成功时
    public static HTTPResult buildSuccess(Object data){
        HTTPResult httpResult = buildSuccess();
        httpResult.setData(data);
        return httpResult;
    }
    public static HTTPResult buildSuccess(){
        return new HTTPResult(MESSAGE_SUCCESS, CODE_SUCCESS);
    }

    public static HTTPResult buildSuccess(int total, Object data){
        HTTPResult httpResult = buildSuccess(data);
        httpResult.setTotal(total);
        return httpResult;
    }
    //失败时
    public static HTTPResult buildFault(){
        return new HTTPResult(MESSAGE_FAULT, CODE_SERVER_ERROR);
    }

    public static HTTPResult buildFault(String message){
        return new HTTPResult(message, CODE_SERVER_ERROR);
    }
}
