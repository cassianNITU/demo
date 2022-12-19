package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository extends PagingAndSortingRepository which in turn extends CrudRepository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
