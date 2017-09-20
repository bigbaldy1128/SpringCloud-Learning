package com.wjz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by wangjinzhao on 2017/8/15.
 */
@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }


}
