package cn.xh.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DServlet")
public class DServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取cookie
        Cookie[] cookie = req.getCookies();
        for (Cookie cookie1 : cookie) {
            if(cookie1.getName().equals("city")) {
                //打印cookie的键
                System.out.println(cookie1.getName());
                //打印cookie的值
                System.out.println(cookie1.getValue());
            }
        }

    }
}
