package com.ngp.api.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngp.api.Model.Product;
import com.ngp.api.Service.ProductService;

@RestController
@RequestMapping("product")
public class productController {

    private ProductService productService;

    productController(ProductService productService){
        this.productService = productService;
    }
            
        @GetMapping ()
        public ArrayList<Product> getProducts(){
           return productService.getProducts();
        }

        @GetMapping ("/{id}")
        public Product getProductsbyId(@PathVariable("id") int id){
           return productService.getProductsbyId(id);
        }


}
