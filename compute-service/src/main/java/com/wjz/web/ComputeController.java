package com.wjz.web;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangjinzhao on 2017/7/31.
 */
@RestController
public class ComputeController {
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return a + b;
    }

    @GetMapping(value = "/user")
    public Object user() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
