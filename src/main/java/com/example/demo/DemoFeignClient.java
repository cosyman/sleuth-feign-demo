package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author lantian.ylt
 */

@FeignClient(name = "echo", url = "http://localhost:8080")
public interface DemoFeignClient {

    @GetMapping("/actuator")
    Map<String, Object> actuator();

}
