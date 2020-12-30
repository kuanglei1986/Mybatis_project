package cn.xh.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class loginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //获取当前请求的uri
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        String uri = request.getRequestURI();
        //判断放行需要放行的资源
        if(uri.contains("/login.jsp")||uri.contains("loginServlet")||uri.contains("CheckCodeServlet")) {
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            //通过判断session有没有值来判断有没有登录
            HttpSession session = request.getSession();
            //已经登录
            if(session.getAttribute("user") != null) {
                filterChain.doFilter(servletRequest,servletResponse);
            } else {
                request.setAttribute("error_message","没有登录");
                request.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
            }
        }
    }

    @Override
    public void destroy() {

    }
}


