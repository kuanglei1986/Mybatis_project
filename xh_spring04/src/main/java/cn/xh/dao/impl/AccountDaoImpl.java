package cn.xh.dao.impl;

import cn.xh.dao.IAccountDao;
import cn.xh.pojo.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements IAccountDao {
    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    private QueryRunner queryRunner;

    public List<Account> findAllAccount() {
        try {
            return queryRunner.query("select * from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
