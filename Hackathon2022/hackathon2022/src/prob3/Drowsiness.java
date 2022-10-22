package prob3;

public class Drowsiness {
	private int drowsiness;
	private String drowsinessDescription;
	
	public Drowsiness(int drowsiness, String drowsinessDescription){
		this.drowsiness = drowsiness;
		this.drowsinessDescription = drowsinessDescription;
	}
	public Drowsiness(int drowsiness) {
		this(drowsiness, "");
	}
	
	public int getDrowsiness(){
		return drowsiness;
	}
	public String drowsinessDescription() {
		return drowsinessDescription;
	}
	
	@Override
	public String toString() {
		return "Drowsiness score: " + drowsiness + "Description of Drowsiness: " + drowsinessDescription;
	}
}
	