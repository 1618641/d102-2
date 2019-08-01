package org.java.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Author: 马果
 * @Date: 2019/7/28 09:59
 * @Description:
 */
@Controller
public class FirstController {
    @GetMapping("/")
    public String first(HttpSession session){
        System.out.println("--------22first-------------");
        //获得认证成功的主体
        Subject subject = SecurityUtils.getSubject();

        //从主体获得用户的主要凭证（就是认证方法，返回的SimpleAuthencationInfo对象的第一个参数，map）
        Map map = (Map) subject.getPrincipal();

        //                 ssss获得用户名与菜单，存放在session中
        String username = (String) map.get("username");
        //获得菜单
        List<Map> menus = (List<Map>) map.get("menus");

        session.setAttribute("user", username);
        session.setAttribute("menus",menus );

        return "/main";
    }
}
