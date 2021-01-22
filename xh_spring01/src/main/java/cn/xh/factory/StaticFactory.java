package cn.xh.factory;

import cn.xh.dao.IAccountDao;
import cn.xh.dao.impl.AccountDaoImpl;

public class StaticFactory {
    public static IAccountDao createAccountDao(){
        return new AccountDaoImpl();
    }
}
