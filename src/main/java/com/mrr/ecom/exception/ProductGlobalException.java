package com.mrr.ecom.exception;

import com.mrr.ecom.dto.ErrorResponseDTO;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.List;


@RestControllerAdvice
public class ProductGlobalException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    private ResponseEntity<ErrorResponseDTO> methodArrgumentEx(MethodArgumentNotValidException ex, WebRequest request) {
        List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(FieldError::getField).toList();
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO(
                LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                errors,
                request.getDescription(false).replace("uri", "")
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponseDTO);

    }
}
