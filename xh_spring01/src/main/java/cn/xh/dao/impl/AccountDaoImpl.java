package cn.xh.dao.impl;

import cn.xh.dao.IAccountDao;

public class AccountDaoImpl implements IAccountDao {

    public AccountDaoImpl(){
        System.out.println("创建了对象！");
    }
    public void saveAccount() {
        System.out.println("jdbc保存账户！");
    }
}
