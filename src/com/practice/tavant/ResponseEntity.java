package com.practice.tavant;

public class ResponseEntity {
    private int status;
    private String message;
    private String errorCode;

    public ResponseEntity(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseEntity(String status, Boolean message, int errorCode) {
       /* this.status = status;
        this.message = message;
        this.errorCode = errorCode;*/
    }
}
