package com.Assesment.loanManagement.exception;

import java.time.LocalDateTime;

public class ErrorResponse {

    private String error;
    private String message;
    private LocalDateTime timestamp;

    public ErrorResponse(String error, String message) {
        this.error = error;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public String getError() {
    	return error;
    }
    public String getMessage() {
    	return message;
    }
    public LocalDateTime getTimeStamp() {
    	return timestamp;
    }
    public void SetError(String error) {
    	this.error = error;
    }
    public void SetMessage(String message) {
    	this.message = message;
    }
}
