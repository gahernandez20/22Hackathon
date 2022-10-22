package prob3;

import java.util.*;

public class Person {

	private String name;
	private int age;
    private int ID;
	public ArrayList<Report> reps = new ArrayList<Report>();
	
    public Person(String name, int age){
        name = this.name;
        age = this.age;
    }

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

    public void setID(int ID){
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }
}
