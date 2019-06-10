package com.qianfeng.springboothello.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author huangguizhao
 */
@Entity
@Data
public class Teacher {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer age;

    @Column
    private String name;


}
