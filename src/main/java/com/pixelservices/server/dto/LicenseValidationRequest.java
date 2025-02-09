package com.pixelservices.server.dto;

public class LicenseValidationRequest {
    private String licenseKey;
    private String hardwareId;

    public LicenseValidationRequest(String licenseKey, String hardwareId) {
        this.licenseKey = licenseKey;
        this.hardwareId = hardwareId;
    }

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public String getHardwareId() {
        return hardwareId;
    }

    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }

    @Override
    public String toString() {
        return "LicenseValidationRequest{" +
                "licenseKey='" + licenseKey + '\'' +
                ", hardwareId='" + hardwareId + '\'' +
                '}';
    }
}