package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: 马果
 * @Date: 2019/7/28 11:26
 * @Description:
 */
@Controller
public class ProdController {

    @GetMapping("/prod/manager")
    public String prodManager(){
        return "/prod/prodManager";
    }
}
