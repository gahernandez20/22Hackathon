package prob3;

import java.util.*;
import java.io.File;  
import java.io.PrintWriter;   
import java.io.IOException;  

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

    protected void writeReportRecord(int ID){
        Person p = pMap.get(ID);
        ArrayList<Report> reports = getReports(ID);
		String fileName = "PatientID:" + ID + "Report.txt";
        File outFile = new File(fileName);
		try{
			PrintWriter writer = new PrintWriter(outFile);
            writer.print("Name\tAge\tID\nReports:\n");
            writer.print(p.getName() + "\t" + p.getAge() + "\t" + ID);
            writer.print("\nReports:\n");
			for(int i = 0; i < reports.size(); i++){
                writer.print(reports.get(i) + "\n");
            }
            writer.close();

        }catch (IOException ioe) {
			System.out.println("Problem creating file or writing");
		}
	}
}