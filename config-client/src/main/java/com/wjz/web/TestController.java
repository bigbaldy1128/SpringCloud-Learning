package com.wjz.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjinzhao on 2017/10/11.
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${message}")
    private String message;

    @GetMapping("/message")
    public String message() {
        return message;
    }
}
