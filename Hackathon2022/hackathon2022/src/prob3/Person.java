package prob3;

import java.util.*;

public class Person {

	private String name;
	private int age;
	public ArrayList<Report> reps = new ArrayList<Report>();
	
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


}
