package cn.xh.web;

import cn.xh.Factory.BeanFactory;
import cn.xh.dao.IAccountDao;
import cn.xh.dao.impl.AccountDaoImpl;
import cn.xh.dao.impl.AccountDaoMybatisImpl;
import cn.xh.service.IAccountService;


public class client {
    public static void main(String[] args) {
        //IAccountDao accountDao = new AccountDaoImpl();
        //IAccountDao accountDao = new AccountDaoMybatisImpl();
        for (int i = 0; i < 5; i++) {
            IAccountService accountService = (IAccountService) BeanFactory.getBean("AccountService");
            accountService.saveAccount();
        }
    }
}
