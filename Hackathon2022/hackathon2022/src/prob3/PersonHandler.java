package prob3;

import java.util.*;
import java.io.File;  
import java.io.PrintWriter;
import java.io.FileNotFoundException;  
import java.util.Scanner;  
import java.util.regex.Matcher;  
import java.util.regex.Pattern;    
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

    private File writeReportRecord(int ID){
        Person p = getPerson(ID);
        ArrayList<Report> reports = getReports(ID);
		String fileName = "PatientID:" + ID + "Report.txt";
		try{
			PrintWriter writer = new PrintWriter(new File(fileName));
			for(int i = 0; i < reps.length; i++){
                
            }
		}
		catch (IOException ioe) {
			System.out.println("Problem creating file or writing");
		}
	}

    

}