package cn.xh.dao.impl;

import cn.xh.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoMybatisImpl implements IAccountDao {
    public void saveAccount() {
        System.out.println("mybatis保存账户！");
    }
}
