package pl.math.uni.lodz.javaproject;

import java.util.List;

public class FactoryProject {
    private static List<Person> list;

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.setSource("XML");
        list.addAll(factory.getPersonByName("XML"));
        factory.setSource("DB");
    }

}
