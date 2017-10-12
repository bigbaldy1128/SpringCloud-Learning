package com.wjz.web;

import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created by wangjinzhao on 2017/7/31.
 */
@Slf4j
@RestController
public class ComputeController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return a + b;
    }

    @GetMapping(value = "/user")
    public Object user(HttpServletRequest httpServletRequest) {
        Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headName = headerNames.nextElement();
            log.info(headName + ":" + httpServletRequest.getHeader(headName));
        }
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
