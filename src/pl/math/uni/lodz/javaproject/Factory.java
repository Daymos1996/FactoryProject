package pl.math.uni.lodz.javaproject;

import java.util.List;

public class Factory implements IFactoryObject {
    IFactoryObject source;

    @Override
    public List<Person> getPersonByName(String name) {
        source.getPersonByName(name);
        return null;
    }

    @Override
    public void setSource(String name) {
        if (name == "XML") {
            source = new XMLFactoryObject();
        }
    }
}