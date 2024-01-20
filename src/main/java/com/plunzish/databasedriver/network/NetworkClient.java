package com.plunzish.databasedriver.network;

import io.netty.channel.epoll.Epoll;

public class NetworkClient {
    private static final boolean EPOLL = Epoll.isAvailable();

    private final int port;

    public NetworkClient(int port) {
        this.port = port;
    }

    public void start() {
        System.out.println("Starting client on port " + port);

    }
}
