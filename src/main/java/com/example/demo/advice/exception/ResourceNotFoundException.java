package com.example.demo.advice.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String name, Long id) {
        super("Could not find resource with type: "+ name +" and id: "+ id);
    }

}