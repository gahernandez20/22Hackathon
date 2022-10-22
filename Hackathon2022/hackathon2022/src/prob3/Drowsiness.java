package prob3;

public class Drowsiness extends Report{


	public Drowsiness (int scale, String description){
		super(scale,description);
}

	
	@Override
	public String toString() {
		return "Drowsiness score: " + drowsiness + "Description of Drowsiness: " + drowsinessDescription;
	}
}
	