package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Product {

    private @Id @GeneratedValue Long id;
    private String name;
    private double price;

    public Product(){}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Product))
            return false;
        Product employee = (Product) obj;
        return Objects.equals(this.id, employee.id)
                && Objects.equals(this.name, employee.name)
                && Objects.equals(this.price, employee.price);
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + this.id + ", name='" + this.name + '\'' + ", price='" + this.price + '\'' + '}';
    }
}
