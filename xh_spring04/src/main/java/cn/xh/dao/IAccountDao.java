package cn.xh.dao;

import cn.xh.pojo.Account;
import java.util.List;

public interface IAccountDao {
    List<Account> findAllAccount();

}
