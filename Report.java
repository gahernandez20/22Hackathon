package git;

public abstract class Report {
	protected Pain pain;
	protected Drowsiness drowsiness;
	protected MentalHealth mentalHealth;
	
	public Report(Drowsiness drowsiness) {
		
		this.drowsiness = drowsiness;
		
	}
	public Report(Pain pain) {
		this.pain = pain;
	}
	public Report(MentalHealth mentalHealth) {
		this.mentalHealth = mentalHealth;
			
		}
	public Object getReport(Object o) {
		return o;
	}
}
