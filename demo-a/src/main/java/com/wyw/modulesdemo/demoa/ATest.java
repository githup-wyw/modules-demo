package com.wyw.modulesdemo.demoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: modules-demo
 * @description: ATest
 * @author: Mr.WYW
 * @create: 2020-01-14 19:
 */
@RestController
public class ATest {

    @GetMapping("/hi")
    public String hi(){
        return "Hello World Demo A!";
    }
}
