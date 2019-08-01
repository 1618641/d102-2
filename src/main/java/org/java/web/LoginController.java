package org.java.web;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.awt.geom.AreaOp;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: 马果
 * @Date: 2019/7/28 10:28
 * @Description:
 * 该控制器，只有两种情况会进入:
 *  1、未登录
 *  2、登录失败
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request) throws  Exception{

        //获得错误信息shiroLoginFailure,如果是由于没有登录，进入控制器，该值为null
        String err = (String) request.getAttribute("shiroLoginFailure");

        //判断消息是否为空
        if(err!=null){
            if(err.endsWith("UnknownAccountException")){
                throw new Exception("用户名不存在...");
            }
            if(err.endsWith("IncorrectCredentialsException")){
                throw new Exception("密码错误");
            }
        }
        return "/login";

    }

}
