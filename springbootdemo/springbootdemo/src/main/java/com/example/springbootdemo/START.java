//package com.example.springbootdemo;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
//public class START {
//    @GetMapping("/START")
//    public String sayHello1() {
//        return "Hello, Spring Boot!12345678";
//    }
//}

package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class START {

    @GetMapping("/START")
    public String sayHello1() {

        String name = "John Doe";  // Example of a name variable
        String greeting = "Welcome to Spring Boot!";  // Example of a greeting variable

        // Return a string with both variables included
        return "Hello, " + name + "! " + greeting + "12345678";
    }
}
