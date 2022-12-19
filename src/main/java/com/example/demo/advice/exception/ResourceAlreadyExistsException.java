package com.example.demo.advice.exception;

public class ResourceAlreadyExistsException extends RuntimeException {

    public ResourceAlreadyExistsException(String name, Long id) {
        super("Resource of type: "+ name +" and id: "+ id +" already exists");
    }

}