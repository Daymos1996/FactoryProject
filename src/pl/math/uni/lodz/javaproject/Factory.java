package pl.math.uni.lodz.javaproject;

import java.util.ArrayList;
import java.util.List;


public class Factory implements IFactoryObject {
    private IFactoryObject source;
    private List<Person> list = new ArrayList<>();

    @Override
    public List<Person> getPersonByName(String name) {
        list = this.source.getPersonByName(name);
        return list;
    }

    @Override
    public void setSource(String name) {
        if (name == "XML") {
            this.source = new XMLFactoryObject();
        }
        if (name == "DB") {
            this.source = new DBFactoryObject();
        }
    }
}