package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {

    // Addition Endpoint
    @GetMapping("/add")
    public String add(@RequestParam int num1, @RequestParam int num2) {
        int sum = num1 + num2;
        return "The result of addition is: " + sum;
    }

    // Subtraction Endpoint
    @GetMapping("/subtract")
    public String subtract(@RequestParam int num1, @RequestParam int num2) {
        int difference = num1 - num2;
        return "The result of subtraction is: " + difference;
    }

    // Multiplication Endpoint
    @GetMapping("/mul")
    public String mul(@RequestParam int num1, @RequestParam int num2) {
        int multi = num1 * num2;
        return "The result of multiplication is: " + multi;
    }
}
