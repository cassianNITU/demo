package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product")
    private List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    private Product getProductById(@PathVariable("id") long id) {
        return productService.getProductById(id);
    }

    @DeleteMapping("/product/{id}")
    private void deleteProductById(@PathVariable("id") long id) {
        productService.deleteProductById(id);
    }

    //here you can change price also
    @PostMapping("/product")
    private long saveOrUpdateProduct(@RequestBody Product product) {
        productService.saveOrUpdateProduct(product);
        return product.getId();
    }
}
