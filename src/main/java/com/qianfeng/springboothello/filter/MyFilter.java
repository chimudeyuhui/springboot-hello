package com.qianfeng.springboothello.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author huangguizhao
 */
@Component
public class MyFilter implements Filter{

    //@Autowire
    // private IUserService service;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter init....");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter doFiler...");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter destroy....");
    }
}
