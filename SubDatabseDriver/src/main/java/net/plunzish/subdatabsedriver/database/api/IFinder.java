package net.plunzish.subdatabsedriver.database.api;

import net.plunzish.subdatabsedriver.database.api.impl.MatchingFinder;
import org.bson.conversions.Bson;

public interface IFinder {

    String getId();
    String h2Filter();
    String sqlFilter();
    Bson mongoFilter();

    static IFinder match(String id, Object value) {
        return new MatchingFinder(id, value);
    }

}
