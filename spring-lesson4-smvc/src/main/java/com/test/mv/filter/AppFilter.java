package com.test.mv.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/29.
 */
/**
 12  * 使用注解标注过滤器
 13  * @WebFilter将一个实现了javax.servlet.Filte接口的类定义为过滤器
 14  * 属性filterName声明过滤器的名称,可选
 15  * 属性urlPatterns指定要过滤 的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 16  */
 @WebFilter(filterName="Servlet3Filter",urlPatterns="/*")
public class AppFilter implements Filter {

 public void destroy() {
  System.out.println("过滤器销毁");
 }


 public void doFilter(ServletRequest request, ServletResponse response,
                      FilterChain chain) throws IOException, ServletException {
  System.out.println("执行过滤操作");
  HttpServletRequest httpRequest = (HttpServletRequest) request;
  System.out.println("请求地址URI："+httpRequest.getRequestURI());
  System.out.println("请求地址URL："+httpRequest.getRequestURL());
  System.out.println("客户端ip:"+httpRequest.getRemoteAddr());
  chain.doFilter(request, response);
 }


 public void init(FilterConfig config) throws ServletException {
  System.out.println("过滤器初始化");
 }
}
