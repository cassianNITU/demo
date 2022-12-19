package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    //get all products
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<Product>();
        productRepository.findAll().forEach(product -> products.add(product));
        return products;
    }

    //getting a specific product by ID
    public Product getProductById(long id) {
        return productRepository.findById(id).get();
    }

    //save or update a product - if the product exist it perform update else it creates a new one
    public void saveOrUpdateProduct(Product product) {
        productRepository.save(product);
    }

    //delete a specific product by ID
    public void deleteProductById(long id) {
        productRepository.deleteById(id);
    }
}
