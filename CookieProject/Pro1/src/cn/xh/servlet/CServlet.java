package cn.xh.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CServlet")
public class CServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.创建Cookie
        Cookie c1 = new Cookie("city","beijing");
        //c1.setMaxAge(1000);//将cookie保存在客户端的磁盘上50秒，50秒后cookie会自动删除
        //c1.setMaxAge(0);//删除cookie
        //c1.setPath("/");
        c1.setDomain(".baidu.com");
        resp.addCookie(c1);
    }
}
