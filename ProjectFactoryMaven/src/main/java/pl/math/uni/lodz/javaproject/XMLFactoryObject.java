package pl.math.uni.lodz.javaproject;

import java.util.ArrayList;
import java.util.List;

public class XMLFactoryObject implements IFactoryObject {
    private List<Person> list;

    public XMLFactoryObject() {
        list = new ArrayList<Person>();
        list.add(new Person("Jan","Kowalski"));
        list.add(new Person("Adam","Nowak"));
        list.add(new Person("Marcin","Gortat"));
    }

    @Override
    public List<Person> getPersonByName(String name) {
        return list;
    }

    @Override
    public void setSource(String name) {

    }

}