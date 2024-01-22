package net.plunzish.subdatabsedriver.database.api.impl;

import com.mongodb.client.model.Filters;
import net.plunzish.subdatabsedriver.database.api.AbstractIdFinder;
import org.bson.conversions.Bson;

public class MatchingFinder extends AbstractIdFinder {

    private final Object value;

    public MatchingFinder(String id, Object value) {
        super(id);
        this.value = value;
    }

    @Override
    public String h2Filter() {
        return null;
    }

    @Override
    public String sqlFilter() {
        return null;
    }

    @Override
    public Bson mongoFilter() {
        return Filters.eq(value);
    }
}
