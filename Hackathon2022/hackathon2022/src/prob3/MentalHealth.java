package prob3;

public class MentalHealth {
	private int mentalHealth;
	private String mentalHealthDescription;
	
	public MentalHealth (int mentalHealth, String mentalHealthDescription) {
		this.mentalHealth = mentalHealth;
		this.mentalHealthDescription = mentalHealthDescription;
	}
	public MentalHealth (int mentalHealth) {
		this(mentalHealth, "");
	}
	
	public int getMentalHealth() {
		return mentalHealth;
	}
	
	public String getMentalHealthDescription() {
		return mentalHealthDescription;
	}
	@Override
	public String toString() {
		return "Mental Health score: " + mentalHealth + "Description of Mental Health: " + mentalHealthDescription;
	}
}
