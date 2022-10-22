package prob3;

import java.util.*;
import java.io.File;  
import java.io.PrintWriter;   
import java.io.IOException;  

public class PersonHandler{
    private Map<Integer, Person> pMap = new HashMap<>();

    public PersonHandler(){}

    public void addPerson(Person p) {
        pMap.put(p.getID(),p);
    }

    public Person getPerson( int id ) {
        return pMap.get(id);
    }


    public ArrayList<Report> getReports(int ID){
        Person p = pMap.get(ID);
        return p.getAllReports();
    }

    protected void writeReportRecord( Person p){
        //Person p = pMap.get(ID);
        int ID = p.getID();
        ArrayList<Report> reports = getReports(ID);
		String fileName = "PatientID:" + ID + "Report.txt";
        File outFile = new File(fileName);
		try{
			PrintWriter writer = new PrintWriter(outFile);
            writer.print("ReportType\tScale\n");
			for( Report r : reports ) {
                if(r instanceof Pain) {
                    Pain painReport = (Pain)r;
                    writer.print("Pain\t");
                    writer.print(painReport.getScale() + "\n");  
                }
                else if(r instanceof Drowsiness) {
                    Drowsiness drowsinessReport = (Drowsiness)r;
                    writer.print("Drowsiness\t");
                    writer.print(drowsinessReport.getScale() + "\n"); 
                }
                else {
                    MentalHealth mentalHealthReport = (MentalHealth)r;
                    writer.print("Mental Health\t");
                    writer.print(mentalHealthReport.getScale() + "\n"); 
                }          
            }
            writer.close();

        }catch (IOException ioe) {
			System.out.println("Problem creating file or writing");
		}
	}
}