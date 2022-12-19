package com.example.demo.advice.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String name, Long id) {
        super("Could not find resource:"+ name +" with id:"+ id);
    }

}