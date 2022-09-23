package com.example.usermanagementdemo.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException() {
        super("Resource not found");
    }

    public ResourceNotFoundException(String resource, Long id){
        super(resource+ " " + id + " not found!");
    }
}
