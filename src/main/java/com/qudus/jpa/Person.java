package com.qudus.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id @GeneratedValue
    private long id;
    private String name;


    public void setName(String name) {
        this.name = name;
    }


    public long getId() {
        return this.id;
    }
}


