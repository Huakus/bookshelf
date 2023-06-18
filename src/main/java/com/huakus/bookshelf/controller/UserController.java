package com.huakus.bookshelf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/asd")
    public String helloWorld() {
        return "Hello world!";
    }
}
