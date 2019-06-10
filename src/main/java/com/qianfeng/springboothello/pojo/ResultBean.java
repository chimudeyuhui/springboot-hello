package com.qianfeng.springboothello.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author huangguizhao
 */
@Data
@AllArgsConstructor
public class ResultBean<T> {

    private String statusCode;

    private T data;
}
