package com.example.ms_products.exception;

public class InvalidProductException extends RuntimeException {
    public InvalidProductException() {
        super("El producto es obligatorio y debe tener un ID");
    }
}
