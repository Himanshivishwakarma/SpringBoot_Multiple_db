package com.example.Postgres.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Postgres.Entites.Product;
import com.example.Postgres.repo.ProductRepo;

@RestController
public class productController {
      @Autowired
    private ProductRepo productRepo;
    @PostMapping("/saveProduct")
    public Product addUser(@RequestBody Product product){
     return this.productRepo.save(product);
    }
}
