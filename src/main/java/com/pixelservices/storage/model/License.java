package com.pixelservices.storage.model;

import com.pixelservices.server.dto.LicenseValidationResponse;

import java.util.List;

public class License {
    private String LicenseKey;
    private String productId;
    private String licenseHolder;
    private List<Session> sessions;
    private int maxSessions;
    private boolean active;

    public LicenseValidationResponse validateSession(Session newSession){
        if (!active) {
            return new LicenseValidationResponse(false, "License is inactive");
        }
        for (Session session : sessions) {
            if (session.equals(newSession)) {
                return new LicenseValidationResponse(true, "Session is valid");
            }
        }

    }
}
