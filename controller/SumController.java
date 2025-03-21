package com.example.demo.controller;

import com.example.demo.model.SumEntity;
import com.example.demo.repository.SumRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sum")

public class SumController {

    private final SumRepository sumRepository;

    public SumController(SumRepository sumRepository) {
        this.sumRepository = sumRepository;
    }

    // ✅ GET method for browser
    @GetMapping("/add")
    public SumEntity addNumbers(@RequestParam int a, @RequestParam int b) {
        // Create a new SumEntity for addition
        SumEntity sumEntity = new SumEntity(a, b);
        sumEntity.setSum(a + b);  // Set the sum (addition result)
        return sumRepository.save(sumEntity);  // Save and return the entity
    }

    // ✅ GET method for subtraction
    @GetMapping("/sub")
    public SumEntity subtractNumbers(@RequestParam int a, @RequestParam int b) {
        // Create a new SumEntity for subtraction
        SumEntity sumEntity = new SumEntity(a, b);
        sumEntity.setSum(a - b);  // Set the sum (subtraction result)
        return sumRepository.save(sumEntity);  // Save and return the entity
    }

    @GetMapping("/mul")
    public SumEntity multNumbers(@RequestParam int a, @RequestParam int b) {
        // Create a new SumEntity for subtraction
        SumEntity sumEntity = new SumEntity(a, b);
        sumEntity.setSum(a * b);  // Set the sum (subtraction result)
        return sumRepository.save(sumEntity);  // Save and return the entity
    }


}
