package com.pixelservices.storage.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Session {
    private final String sessionId;
    private final LocalDateTime time;
    private final String ip;
    private final String hardwareId;

    public Session(String sessionId, String ip, String hardwareId) {
        this.sessionId = sessionId;
        time = LocalDateTime.now();
        this.ip = ip;
        this.hardwareId = hardwareId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public boolean equals(Session session) {
        return Objects.equals(ip, session.ip) && Objects.equals(hardwareId, session.hardwareId);
    }
}
