package com.example.demo.entity;



import jakarta.persistance.entity;
import jakarta.persistance.GeneratedValue;
import jakarta.persistence.GenerationTpe;
import jakarta.persistance.id;

import java.time.LocalDate;

public class student {
    private int id;
    private String name;
    private String email;
   
    private float cgpa;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public student(int id, String name, String email, float cgpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }
}

