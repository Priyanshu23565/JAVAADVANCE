package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sumda")
public class SumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int a;
    private int b;
    private int sum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    // ✅ Default Constructor (Required by JPA)
    public SumEntity() {}

    // ✅ Parameterized Constructor
    public SumEntity(int a, int b) {
        this.a = a;
        this.b = b;
        // Assuming we will set sum manually (addition or subtraction) later
    }


    // Getters and Setters

}
