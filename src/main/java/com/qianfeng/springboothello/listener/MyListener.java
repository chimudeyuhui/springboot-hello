package com.qianfeng.springboothello.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author huangguizhao
 */
@Component
public class MyListener implements ServletRequestListener{

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("MyListener requestInitialized...");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("MyListener requestDestroyed....");
    }
}
