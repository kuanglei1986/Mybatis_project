package cn.xh.service.impl;

import cn.xh.dao.IAccountDao;
import cn.xh.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Resource(name="accountDaoMybatisImpl")
    private IAccountDao accountDao;

    @Value("北京")
    private String address;

    public void saveAccount() {
        accountDao.saveAccount();
        System.out.println(address);

    }
}
