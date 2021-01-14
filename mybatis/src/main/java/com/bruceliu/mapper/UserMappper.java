package com.bruceliu.mapper;

import com.bruceliu.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author bruceliu
 * @create 2019-09-02 10:42
 * @description  Dao层接口
 */

public interface UserMappper {
    public abstract List<User> findList();
    public int addUser(User user);
    public User getById(int id);

    public int updateUserById(User user);;

    public int deleteUser(int id);

    public List<User> findUsersByName(String username);

    public List<User> findUsersByName1(String username);
}
