package pl.math.uni.lodz.javaproject;

import java.util.ArrayList;
import java.util.List;

public class XMLFactoryObject implements IFactoryObject {
    private List<Person> list;

    public XMLFactoryObject() {
        list = new ArrayList<>();
        list.add(new Person("Jan","Kowalski"));
        list.add(new Person("Adam","Nowak"));
    }

    @Override
    public List<Person> getPersonByName(String name) {
        return list;
    }

    @Override
    public void setSource(String name) {

    }

}