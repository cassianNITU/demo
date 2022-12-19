package com.example.demo;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @BeforeEach
    void setUp() {
        productRepository.deleteAll();
        Product product1 = new Product("p1", 1.00);
        Product product2 = new Product("p2", 2.00);
        productRepository.save(product1);
        productRepository.save(product2);
    }

    @Test
    void testGetAllProducts() {
        List<Product> actualResult = productRepository.findAll();
        List<Product> expectedResult = productService.getAllProducts();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGetProductById() {
        Product product = productRepository.save(new Product("p3", 3.00));
        Long actualID = product.getId();
        Product actualResult = productRepository.findById(actualID).orElse(null);
        Product expectedResult = productService.getProductById(actualID);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDeleteProduct() {
        Product product = productRepository.save(new Product("p3", 3.00));
        Long actualID = product.getId();
        Assertions.assertEquals(3, productRepository.count());
        productService.deleteProductById(actualID);
        Assertions.assertEquals(2, productRepository.count());
        Assertions.assertFalse(productRepository.findAll().contains(product));
    }

}
