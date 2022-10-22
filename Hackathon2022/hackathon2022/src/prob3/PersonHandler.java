package prob3;

import java.util.*;

public class PersonHandler{
    private Map<Integer, Person> pMap = new HashMap<>();

    public PersonHandler(){}

    public void addPerson(Person p){
        pMap.put(p.getID(),p);
    }

    public ArrayList<Report> getReports(int ID){
        Person p = pMap.get(ID);
        ArrayList<Report> retList = new ArrayList<Report>(p.getAllReports());
        return retList;
    }
}