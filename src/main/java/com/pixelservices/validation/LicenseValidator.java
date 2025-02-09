// src/main/java/com/pixelservices/validation/LicenseValidator.java
package com.pixelservices.validation;

import com.pixelservices.server.dto.LicenseValidationRequestWrapper;
import com.pixelservices.storage.Storage;
import com.pixelservices.storage.model.License;
import com.pixelservices.server.dto.LicenseValidationResponse;
import com.pixelservices.storage.model.Session;

public class LicenseValidator {
    private final Storage storage;

    public LicenseValidator(Storage storage) {
        this.storage = storage;
    }

    public LicenseValidationResponse validateLicense(LicenseValidationRequestWrapper request) {
        License license = storage.getLicense(request.getRequest().getLicenseKey());
        if (license == null) {
            return new LicenseValidationResponse(false, "License not found");
        }
        return license.validateSession(new Session(null, request.getIp(), request.getRequest().getHardwareId()));
    }
}