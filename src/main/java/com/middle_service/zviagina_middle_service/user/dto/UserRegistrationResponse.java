package com.middle_service.zviagina_middle_service.user.dto;

public class UserRegistrationResponse {
    private String status;
    private String message;

    public UserRegistrationResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
