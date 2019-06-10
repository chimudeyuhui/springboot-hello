package com.qianfeng.springboothello.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author huangguizhao
 */
@Data
public class Student {

    private Integer id;

    @NotNull(message = "name is null!")
    private String name;
}
