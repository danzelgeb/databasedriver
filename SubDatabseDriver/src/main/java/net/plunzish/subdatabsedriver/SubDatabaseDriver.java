package net.plunzish.subdatabsedriver;

import lombok.Getter;
import net.plunzish.subdatabsedriver.data.Data;
import net.plunzish.subdatabsedriver.database.utils.DatabaseType;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;

@Getter
public final class SubDatabaseDriver extends JavaPlugin {
    @Getter private static SubDatabaseDriver instance;
    private DatabaseType databaseType;

    @Override
    public void onLoad() {
        instance = this;

    }

    @Override
    public void onEnable() {
        //Check DB Type
    }

    @Override
    public void onDisable() {

    }
}
