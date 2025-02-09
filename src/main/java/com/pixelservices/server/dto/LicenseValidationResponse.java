package com.pixelservices.server.dto;

public class LicenseValidationResponse {
    private boolean valid;
    private String message;

    public LicenseValidationResponse(boolean valid, String message) {
        this.valid = valid;
        this.message = message;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LicenseValidationResponse{" +
                "valid=" + valid +
                ", message='" + message + '\'' +
                '}';
    }
}