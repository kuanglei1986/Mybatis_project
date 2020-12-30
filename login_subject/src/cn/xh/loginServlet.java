package cn.xh;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取到用户名，密码和验证码
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");
        //2.比较验证码是否正确
        HttpSession session = req.getSession();
        //忽略大小写的比较
        if(checkCode.equalsIgnoreCase((String)session.getAttribute("checkCode_session"))){
            session.removeAttribute("checkCode_session");
            //验证用户名和密码
            if(userName.equals("zhangsan")&&password.equals("123")){
                session.setAttribute("user",userName);
                resp.sendRedirect(req.getContextPath()+"/success.jsp");
            }else{
                req.setAttribute("error_message","用户名或密码错误！");
                req.getRequestDispatcher("/login.jsp").forward(req,resp);
            }
        }else{
            req.setAttribute("error_message","验证码错误！");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }

    }
}
