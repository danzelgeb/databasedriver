package net.plunzish.subdatabsedriver.database.api;

import net.plunzish.subdatabsedriver.database.api.impl.FinderAbstract;
import org.bson.conversions.Bson;

public interface IFinder {

    String getId();
    String h2Filter();
    String sqlFilter();
    Bson mongoFilter();

    static IFinder match(String id, Object value) {
        return new FinderAbstract(id, value);
    }

}
