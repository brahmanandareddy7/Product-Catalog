package com.mrr.ecom.exception;

public class CategoryNotFoundException extends RuntimeException{
    String message;

   public CategoryNotFoundException(String message){
        super(message);
    }
}
