package pl.math.uni.lodz.javaproject;

import pl.math.uni.lodz.javaproject.dataobjects.CSVFactoryObject;
import pl.math.uni.lodz.javaproject.dataobjects.DBFactoryObject;
import pl.math.uni.lodz.javaproject.dataobjects.TXTFactoryObject;
import pl.math.uni.lodz.javaproject.dataobjects.XMLFactoryObject;

import java.util.ArrayList;
import java.util.List;


public class Factory implements IFactoryObject {
    private IFactoryObject source;
    private List<Person> list = new ArrayList<Person>();

    @Override
    public List<Person> getPersonByName(String name) {
        list = this.source.getPersonByName(name);
        return list;
    }

    @Override
    public void setSource(String name) {
        if (name.equalsIgnoreCase("XML")) {
            this.source = new XMLFactoryObject();
        }
        if (name.equalsIgnoreCase("DB")) {
            this.source = new DBFactoryObject();
        }
        if (name.equalsIgnoreCase("TXT")) {
            this.source = new TXTFactoryObject();
        }
        if (name.equalsIgnoreCase("CSV")) {
            this.source = new CSVFactoryObject();
        }
    }
}