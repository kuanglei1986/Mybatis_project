package cn.xh.factory;

import cn.xh.dao.IAccountDao;
import cn.xh.dao.impl.AccountDaoImpl;

public class InstanceFactory {
    public IAccountDao createAccountDao(){
        return new AccountDaoImpl();
    }
}
