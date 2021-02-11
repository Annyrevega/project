package com.revega.example.project.model;

import com.revega.example.project.model.Product;

import java.util.List;

public class Recept {
    private Long id;
    private List<Product> product;

    public Recept(Long id, List<Product> product) {
        this.id = id;
        this.product = product;
    }

    public Recept() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public void may() {
        System.out.println("!kk");
    }
}
