package cn.xh.dao.impl;

import cn.xh.dao.IAccountDao;

public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("jdbc保存账户！");
    }
}
