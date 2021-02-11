package com.revega.example.project.service;

import com.revega.example.project.model.Product;
import com.revega.example.project.model.Recept;

import java.util.List;

public class ReceptService {
    public void create(List<Product> products) {
        Recept recept = new Recept(1L, products);
    }
}
