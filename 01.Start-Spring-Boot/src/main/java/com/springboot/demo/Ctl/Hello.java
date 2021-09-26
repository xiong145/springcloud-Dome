package com.springboot.demo.Ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    String index() {
        return "hello spring boot";
    }

}
