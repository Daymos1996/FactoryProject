package pl.math.uni.lodz.javaproject.dataobjects;

import pl.math.uni.lodz.javaproject.IFactoryObject;
import pl.math.uni.lodz.javaproject.Person;

import java.util.ArrayList;
import java.util.List;

public class CSVFactoryObject implements IFactoryObject {
    private List<Person> list;

    public CSVFactoryObject() {
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
