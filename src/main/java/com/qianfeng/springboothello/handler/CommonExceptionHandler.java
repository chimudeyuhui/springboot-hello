package com.qianfeng.springboothello.handler;

import com.qianfeng.springboothello.pojo.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author huangguizhao
 */
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handlerException(Exception e){
        return new ResultBean("500",e.getMessage());
        //return new ResultBean("404","当前服务器繁忙，请稍后再试！");
    }
}
