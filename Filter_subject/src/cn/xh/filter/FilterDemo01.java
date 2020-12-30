package cn.xh.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//@WebFilter("/")
//@WebFilter(urlPatterns = "/index",dispatcherTypes = DispatcherType.FORWARD)
public class FilterDemo01 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter1");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("doFilter1回来了！");
    }

    @Override
    public void destroy() {
        System.out.println("destroy...");

    }

}
