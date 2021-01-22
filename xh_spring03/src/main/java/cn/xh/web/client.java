package cn.xh.web;

import cn.xh.dao.IAccountDao;
import cn.xh.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        IAccountDao accountDao = (IAccountDao) context.getBean("accountDao");
//        accountDao.saveAccount();

        IAccountService accountService = (IAccountService) context.getBean("accountService");
        accountService.saveAccount();
    }
}
