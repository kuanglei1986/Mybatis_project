package com.bruceliu.mapper;

import com.bruceliu.bean.User;

import java.util.List;

/**
 * @author bruceliu
 * @create 2019-09-02 10:42
 * @description  Dao层接口
 */

public interface UserMappper {
    public abstract List<User> findList();
    public int addUser(User user);
}
