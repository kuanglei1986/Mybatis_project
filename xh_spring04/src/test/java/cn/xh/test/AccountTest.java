package cn.xh.test;

import cn.xh.pojo.Account;
import cn.xh.service.IAccountService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


public class AccountTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IAccountService service = (IAccountService)context.getBean("accountService");
        List<Account> lst = service.findAllAccount();
        for (Account account : lst) {
            System.out.println(account.getName());
        }

    }
}
