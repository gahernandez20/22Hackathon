package prob3;

import java.util.*;

public class PersonHandler{
    private Map<Integer, Person> pMap = new HashMap<>();

    public PersonHandler(){}

    public void addPerson(Person p) {
        Set<Integer> keys = pMap.keySet();
        for( Integer key : keys ) {
            if( p.getID() == key ) {
                continue;
            }
            else {
                pMap.put(p.getID(),p);
            }
        }
    }

    public Person getPerson( int id ) {
        return pMap.get(id);
    }

    public ArrayList<Report> getReports(int ID){
        Person p = pMap.get(ID);
        return p.getAllReports();
    }
}