package pl.math.uni.lodz.javaproject;

import java.util.ArrayList;
import java.util.List;

public class DBFactoryObject implements IFactoryObject {
    private List<Person> list;

    public DBFactoryObject() {
        list = new ArrayList<Person>();
        list.add(new Person("Marek","Kot"));
        list.add(new Person("Kuba","Rzeznicki"));
    }

    @Override
    public List<Person> getPersonByName(String name) {
        return list;
    }

    @Override
    public void setSource(String name) {

    }

}