package prob3;

public class MentalHealth extends Report{


	public mentalHealth (int scale, String description){
		super(scale, description);
	}

	@Override
	public String toString() {
		return "Mental Health score: " + scale + "Description of Mental Health: " + description;
	}
}
