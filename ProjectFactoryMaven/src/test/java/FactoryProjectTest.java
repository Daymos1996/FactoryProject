
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import pl.math.uni.lodz.javaproject.Factory;
import pl.math.uni.lodz.javaproject.Person;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FactoryProjectTest {


    private static List<Person> list;
    private static Map<String, List<Person>> factories;

    @Before
    public void setUp() {
        factories = new HashMap<String, List<Person>>();
        list = new ArrayList<Person>();

        Factory factory = new Factory();

        factory.setSource("XML");
        list.addAll(factory.getPersonByName("XML"));
        factories.put("XML",list);

        factory.setSource("DB");
        list.addAll(factory.getPersonByName("DB"));
        factories.put("DB",list);
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Ile zrodel:"+factories.size());
        System.out.println("Rozmiar listy: "+list.size());
    }


    @Test
    public void isNotNullFactories(){

        assertNotNull(factories);
    }
    @Test
    public void listInFactoryNotNull() {
        assertNotNull(factories.get("XML"));
        assertNotNull(factories.get("DB"));
    }
    @Test
    public void personInListHaveFirstName() {
        assertNotNull(factories.get("XML").get(0).getFirstName());
    }
    @Test
    public void personInListHaveSecondName() {
        assertNotNull(factories.get("XML").get(0).getSecondName());
    }
    @Test
    public void personInListHaveFirstNameAndSecondName() {
        assertNotNull(factories.get("XML").get(0).getFirstName() , factories.get("XML").get(0).getSecondName());
    }
}