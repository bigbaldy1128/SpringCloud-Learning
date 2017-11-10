package com.wjz.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by wangjinzhao on 2017/11/9.
 */
@FeignClient(name = "trace-2")
public interface TraceClient {
    @GetMapping("/trace-2")
    String trace();
}
