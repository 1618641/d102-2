package org.java.service.impl;

import org.java.dao.UserMappper;
import org.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: 马果
 * @Date: 2019/7/28 10:48
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMappper userMappper;

    @Override
    public Map login(String username) {
        List<Map> list = userMappper.login(username);
        if(list.isEmpty()){
            return null;//用户名不存在
        }else{
            return list.get(0);
        }
    }

    @Override
    public List<Map> loadMenus(int userId) {
        return userMappper.loadMenus(userId);
    }

    @Override
    public List<String> loadPermission(int userId) {
        return userMappper.loadPermission(userId);
    }
}
