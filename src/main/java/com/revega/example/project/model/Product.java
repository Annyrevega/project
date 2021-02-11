package com.revega.example.project.model;

import java.util.ArrayList;

public class Product {
   private int id;
   private String name;
   private int count;

    public Product(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public Product() {
    }

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
