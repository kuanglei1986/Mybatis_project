package cn.xh.service.impl;

import cn.xh.Factory.BeanFactory;
import cn.xh.dao.IAccountDao;
import cn.xh.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    @Override
    public void saveAccount() {
        IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("AccountDao");
        accountDao.saveAccount();
    }
}
