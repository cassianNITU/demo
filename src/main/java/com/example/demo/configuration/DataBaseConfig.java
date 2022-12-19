package com.example.demo.configuration;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseConfig {

    private static final Logger log = LoggerFactory.getLogger(DataBaseConfig.class);

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {

        return args -> {
            log.info("Insert " + productRepository.save(new Product("Product1", 100.00)));
            log.info("insert " + productRepository.save(new Product("Product2", 200.00)));
            log.info("Insert " + productRepository.save(new Product("Product3", 300.00)));
            log.info("insert " + productRepository.save(new Product("Product4", 400.00)));
            log.info("Insert " + productRepository.save(new Product("Product5", 500.00)));
        };

    }
}
