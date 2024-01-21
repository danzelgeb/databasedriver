package net.plunzish.subdatabsedriver;

import lombok.Getter;
import net.plunzish.subdatabsedriver.data.Data;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;

public final class SubDatabaseDriver extends JavaPlugin {
    @Getter private static SubDatabaseDriver instance;

    @Override
    public void onLoad() {
        instance = this;

    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }
}
