package cn.xh.cn.xh.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@WebListener
public class servletLoaderListener implements  ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("servletContext创建了！");
        //当servletContext对象创建的时候（服务器启动的时候）把web.xml中配置的文件加载到内存

        //获取servletContext对象
         ServletContext context = servletContextEvent.getServletContext();
         String path = context.getInitParameter("myparam");
         String realPath = context.getRealPath(path);
         try {
            FileInputStream input = new FileInputStream(realPath);
            System.out.println(input);
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("servletContext被销毁了！");
    }
}
