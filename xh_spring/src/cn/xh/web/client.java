package cn.xh.web;

import cn.xh.dao.IAccountDao;
import cn.xh.dao.impl.AccountDaoImpl;
import cn.xh.dao.impl.AccountDaoMybatisImpl;

public class client {
    public static void main(String[] args) {
//        IAccountDao accountDao = new AccountDaoImpl();
        IAccountDao accountDao = new AccountDaoMybatisImpl();
        accountDao.saveAccount();

    }
}
