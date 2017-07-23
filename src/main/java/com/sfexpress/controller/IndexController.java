package com.sfexpress.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by doobo@foxmail.com on 2017/7/23.
 */
@RestController
public class IndexController {

    @GetMapping("")
    public String say(){
        return "Hello SpringBoot";
    }
}
