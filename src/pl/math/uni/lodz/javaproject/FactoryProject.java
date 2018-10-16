package pl.math.uni.lodz.javaproject;

import java.util.ArrayList;
import java.util.List;

public class FactoryProject {
    private static List<Person> list;

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.setSource("XML");
        list = new ArrayList<>();
        list.addAll(factory.getPersonByName("XML"));

        System.out.println(list.get(0).getFirstName());
        System.out.println(list.get(1).getFirstName());

        factory.setSource("DB");
        list.addAll(factory.getPersonByName("DB"));

        System.out.println(list.get(2).getFirstName());
        System.out.println(list.get(3).getFirstName());
    }

}
