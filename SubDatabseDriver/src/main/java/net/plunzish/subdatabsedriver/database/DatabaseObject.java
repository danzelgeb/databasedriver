package net.plunzish.subdatabsedriver.database;

public abstract class DatabaseObject {

    private final String name;

    public DatabaseObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
