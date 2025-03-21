package com.example.demo.service;

import com.example.demo.model.SumEntity;
import com.example.demo.repository.SumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SumService {
    @Autowired
    private SumRepository sumRepository;

    public SumEntity addNumbers(int a, int b) {
        SumEntity sumEntity = new SumEntity(a, b);
        return sumRepository.save(sumEntity);  // Database me insert karega
    }
}
