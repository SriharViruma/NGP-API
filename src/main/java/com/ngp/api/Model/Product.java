package com.ngp.api.Model;

import lombok.Data;

@Data 
public class Product {
    int id;
    String name;
    String category;
    double price;

    public Product(int id, String name,String category,double price){
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
}
