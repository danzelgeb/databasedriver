package com.plunzish.databasedriver;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import lombok.Getter;

@Plugin(id = "databasedriver", name = "DatabaseDriver", version = "1.0", description = "A plugin to connect to a database")
public final class DatabaseDriver {
    @Getter private static DatabaseDriver instance;
    private final ProxyServer server;

    @Inject
    public DatabaseDriver(ProxyServer server) {
        instance = this;
        this.server = server;
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        // Your initialization code goes here
        System.out.println("Your plugin has been initialized!");
    }
}