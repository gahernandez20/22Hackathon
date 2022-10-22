package prob3;

import java.util.*;
import java.io.File;  
import java.io.PrintWriter;   
import java.io.IOException;  

public class PersonHandler{
    private Map<Integer, Person> pMap = new HashMap<>();

    public PersonHandler(){}

    public void addPerson(Person p){
        pMap.put(p.getID(),p);
    }


    public ArrayList<Report> getReports(int ID){
        Person p = pMap.get(ID);
        ArrayList retList = new ArrayList<Report>(p.getAllReports());
        return retList;
    }

    private void writeReportRecord(int ID){
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