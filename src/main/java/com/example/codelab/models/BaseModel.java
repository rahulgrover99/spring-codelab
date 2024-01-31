package com.example.codelab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class BaseModel {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "testing")
    private String name;


    @Override
    public String toString() {
        return "BaseModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
