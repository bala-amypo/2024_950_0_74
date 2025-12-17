package com.example.demo.entity;



import jakarta.persistence.entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationTpe;
import jakarta.persistence.Id;


@entity
public class student {
    @Id
    @GeneratedValue(statergy = GenerationTpe.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    public int getId(){
        return id;
    }
   
    private float cgpa;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
    
   
    public student(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

