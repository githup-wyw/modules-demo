package com.yx.modulesdemo.demob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: modules-demo
 * @description: BTest
 * @author: Mr.WYW
 * @create: 2020-01-14 19:
 */
@RestController
public class BTest {

    @GetMapping("/hi")
    public String hi(){
        return "Hello World Demo B!";
    }
}
