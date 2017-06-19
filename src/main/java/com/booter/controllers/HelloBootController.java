package com.booter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBootController {

    @RequestMapping("/hi")
    public String sayHi() {
        return "hi";
    }
}
