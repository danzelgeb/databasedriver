package net.plunzish.subdatabsedriver.database.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class AbstractIdFinder implements IFinder {

    private String id;

}
