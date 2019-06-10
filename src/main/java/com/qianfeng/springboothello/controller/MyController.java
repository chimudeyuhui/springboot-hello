package com.qianfeng.springboothello.controller;

import com.qianfeng.springboothello.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;

/**
 * @author huangguizhao
 *
 * 1，SpringBoot帮助我们快速构建Spring应用
 * 2，统一管理了版本，避免了冲突
 * 3，插件的模式来快速整合第三方的东西，比如开发一个web应用，引入starter-web即可（启动器）
 * 4，内嵌tomcat，方便部署的扩展，jar包即可
 * 5, SpringBoot默认会扫描当前包和子包下面的所有类
 *
 * war包
 */
@Controller
@RequestMapping("my")
@Slf4j
public class MyController {

    //private Logger logger = LoggerFactory.getLogger(MyController.class);

    @Value("${image.server}")
    private String imageServer;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello,SpringBoot！！！so easy!"+imageServer;
    }

    @RequestMapping("getDate")
    @ResponseBody
    public Date getDate(Date date){
        //System.out.println(date);
        //logger.info(date.toString());
        log.info(date.toString());
        return date;
    }

    @RequestMapping("getImageServer")
    @ResponseBody
    public String getImageServer(){
        return imageServer;
    }

    @RequestMapping("save")
    @ResponseBody
    public String saveStudent(@Valid Student student){
        System.out.println(student.getName());
        return "ok";
    }
}
