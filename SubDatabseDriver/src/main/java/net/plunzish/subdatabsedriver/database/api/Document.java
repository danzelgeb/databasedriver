package net.plunzish.subdatabsedriver.database.api;

import net.plunzish.subdatabsedriver.SubDatabaseDriver;

public class Document {

    public static void create(String name) {
        if (SubDatabaseDriver.getInstance().getDatabaseType() ==  null) {
            throw new NullPointerException("No valid database type provided!");
        }

        switch (SubDatabaseDriver.getInstance().getDatabaseType()) {
            case MONGODB:
                break;
            case MYSQL:

                break;
            case H2:
                break;
            default:
                throw new NullPointerException("No valid database type provided!");
        }
    }

}
