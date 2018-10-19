package pl.math.uni.lodz.javaproject;

import java.util.ArrayList;
import java.util.List;

public class TXTFactoryObject implements IFactoryObject {
    private List<Person> list;

    public TXTFactoryObject() {
        list = new ArrayList<>();
        list.add(new Person("Radek","Lot"));
        list.add(new Person("Franek","Kowaliski"));
        //test gita

    }

    @Override
    public List<Person> getPersonByName(String name) {
        return list;
    }

    @Override
    public void setSource(String name) {

    }
}
