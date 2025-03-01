package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello3() {
        return "Hello, Spring Boot!";
    }

//    @GetMapping("/add")
//    public int addfun(){
//        return  2+2;
//    }
}
