package cn.xh.dao.impl;

import cn.xh.dao.IAccountDao;

public class AccountDaoMybatisImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("mybatis保存账户！");
    }
}
