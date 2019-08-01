package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: 马果
 * @Date: 2019/7/28 10:45
 * @Description:
 */
@Mapper
public interface UserMappper {
    /**
     * 判断，用户名是否存在
     * @param username
     * @return
     */
    public List<Map> login(@Param("username") String username);

    /**
     * 加载菜单
     * @param userId
     * @return
     */
    public List<Map> loadMenus(int userId);

    /**
     * 查询用户访问权限
     * @param userId
     * @return
     */
    public List<String> loadPermission(int userId);
}
