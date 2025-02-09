package com.pixelservices.server.dto;

import java.time.LocalDateTime;

public class LicenseValidationRequestWrapper {
    private final LicenseValidationRequest request;
    private final String ip;
    private final LocalDateTime time;

    public LicenseValidationRequestWrapper(LicenseValidationRequest request, String ip, LocalDateTime time) {
        this.request = request;
        this.ip = ip;
        this.time = time;
    }

    public LicenseValidationRequest getRequest() {
        return request;
    }

    public String getIp() {
        return ip;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "LicenseValidationRequestWrapper{" +
                "request=" + request +
                ", ip='" + ip + '\'' +
                ", time=" + time +
                '}';
    }
}