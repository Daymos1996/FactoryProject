package pl.math.uni.lodz.javaproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactoryProject {
    private static List<Person> list;
    private static Map<String, List<Person>> factories;
    public static void main(String[] args) {

        factories = new HashMap<>();
        list = new ArrayList<>();

        Factory factory = new Factory();
        factory.setSource("XML");

        list.addAll(factory.getPersonByName("XML"));
        factories.put("XML",list);

        System.out.println(factories.get("XML").get(0).getFirstName());

        factory.setSource("DB");
        list.addAll(factory.getPersonByName("DB"));
        factories.put("DB",list);

        System.out.println(factories.get("DB").get(2).getFirstName());
        


    }

}
