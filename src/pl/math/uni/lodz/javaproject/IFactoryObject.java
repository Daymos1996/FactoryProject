package pl.math.uni.lodz.javaproject;

import java.util.List;

public interface IFactoryObject {

    List<Person> getPersonByName(String name);
    void setSource(String name);
}
