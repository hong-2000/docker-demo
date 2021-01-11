package com.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hong-2000
 * @version 1.0
 * @description
 * @create 2021/1/11 15:09
 */
@RestController
public class IndexController {
    @GetMapping({"/hello"})
    public String Hello() {
        return "hello...";
    }
}
