package prob3;

import java.util.*;
import java.io.File;  
import java.io.PrintWriter;   
import java.io.IOException;  

public class PersonHandler{
    //Initialize HashMap that stores each person and their reports
    private Map<Integer, Person> pMap = new HashMap<>();

    public PersonHandler(){}

    public void addPerson( Person p ) {
        pMap.put(p.getID(),p);
    }

    public Person getPerson( int id ) {
        return pMap.get(id);
    }
    
    //Method that returns all reports from specified person
    public ArrayList<Report> getReports(int ID){
        Person p = pMap.get(ID);
        return p.getAllReports();
    }

    //Method that writes report to .txt file
    protected void writeReportRecord( Person p ){
        
        int ID = p.getID();
        ArrayList<Report> reports = getReports(ID);
		String fileName = "PatientID:" + ID + "Report.txt";
        File outFile = new File(fileName);
		try{
			PrintWriter writer = new PrintWriter(outFile);
            writer.print("ReportType\tScale\n");
            //Prints report information based on report type
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

        } catch ( IOException ioe ) {
			System.out.println("Problem creating file or writing");
		}
	}
}