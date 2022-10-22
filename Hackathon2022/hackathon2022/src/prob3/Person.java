package prob3;

import java.util.*;

public class Person {

	private String name;
	private int age;
    private int ID;
	public ArrayList<Report> reps = new ArrayList<Report>();
	Random rand = new Random(System.currentTimeMillis());
	
    public Person(String name, int age){
        name = this.name;
        age = this.age;
		String s = String.format("%04d",rand.nextInt(10000));
		ID = Integer.parseInt(s); 
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


	public static void main(String[] args){
		Person p1 = new Person("steve", 33);
		System.out.println(p1.getID());
	}
}
