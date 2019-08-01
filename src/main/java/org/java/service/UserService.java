package org.java.service;

import java.util.List;
import java.util.Map;

/**
 * @Author: 马果
 * @Date: 2019/7/28 10:47
 * @Description:
 */
public interface UserService {

    public Map login(String username);

    public List<Map> loadMenus(int userId);

    public List<String> loadPermission(int userId);
}
