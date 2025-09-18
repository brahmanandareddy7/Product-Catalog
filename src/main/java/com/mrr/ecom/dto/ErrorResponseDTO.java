package com.mrr.ecom.dto;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ErrorResponseDTO {
    private LocalDateTime localDateTime;
    private int statusCode;
    private String message;
    private List<String> stackTrace;
    private String path;

    public ErrorResponseDTO(LocalDateTime localDateTime, int statusCode, String message, List<String> stackTrace, String path) {
        this.localDateTime = localDateTime;
        this.statusCode = statusCode;
        this.message = message;
        this.stackTrace = new ArrayList<>(stackTrace);
        this.path = path;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(List<String> stackTrace) {
        this.stackTrace = stackTrace;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
