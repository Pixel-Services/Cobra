package com.pixelservices;

import com.pixelservices.config.YamlConfig;
import com.pixelservices.server.CobraServer;

public class Cobra {
    private final CobraServer server;

    private Cobra(int port) {
        server = new CobraServer(port, null);
    }

    private Cobra() {
        this(new YamlConfig().getInt("port", 2222));
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            int port = Integer.parseInt(args[0]);
            new Cobra(port);
        } else {
            new Cobra();
        }
    }
}