package com.example.demo.repository;

import com.example.demo.model.SumEntity;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface SumRepository extends JpaRepository<SumEntity,Long> {
}
