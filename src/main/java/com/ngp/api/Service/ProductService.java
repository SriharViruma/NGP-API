package com.ngp.api.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.ngp.api.Model.Product;

@Service
public class ProductService {
    ArrayList<Product> list = new ArrayList<>();

    ProductService() {
        list.add(new Product(1, "Monitor", "Accessories", 25000.00));
        list.add(new Product(2, "Keyboard", "Accessories", 2000));
        list.add(new Product(3, "Ryzen 5 AI", "Chipset", 75000));
        list.add(new Product(4, "Corsair 16GB 2300MHZ DDR4", "Storage", 50000));
    }

    public ArrayList<Product> getProducts() {
        return list;
    }

    public Product getProductsbyId(int id) {
        for (Product i : list) {
            if (i.getId() == id) {
                return i;
            }
        }
        return new Product(id, null, null, 0);
    }

    public Product getProductsbyCategory(String category) {
         for (Product i : list) {
            if (i.getCategory().equals(category)) {
                return i;
            }
        }
        return new Product(0, null, null, 0);
    }

}
