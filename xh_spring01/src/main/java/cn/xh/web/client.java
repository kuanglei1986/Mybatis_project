package cn.xh.web;


import cn.xh.dao.IAccountDao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class client {
    public static void main(String[] args) {
        //IAccountDao accountDao = new AccountDaoImpl();
        //IAccountDao accountDao = new AccountDaoMybatisImpl();
//        for (int i = 0; i < 5; i++) {
//            IAccountService accountService = (IAccountService) BeanFactory.getBean("AccountService");
//            accountService.saveAccount();
//        }

        //1.创建一个工厂
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        ClassPathResource resource = new ClassPathResource("beans.xml");
//        BeanFactory context = new XmlBeanFactory(resource);

        //ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\admin\\Desktop\\beans.xml");

       for (int i = 0; i < 5; i++) {
           //2.通过工厂获取对象
            IAccountDao accountDao =  (IAccountDao)context.getBean("accountDao");
            accountDao.saveAccount();
        }

    }
}
