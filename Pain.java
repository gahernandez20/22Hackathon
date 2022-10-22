package git;

public class Pain {
	private int pain;
	private String painDescription;

	public Pain (int pain, String painDescription){
	this.pain = pain;
	this.painDescription = painDescription;
}
	public int getPain() {
		return pain;
	}
	
	public String getPainDescription() {
		return painDescription;
	}
	@Override
	public String toString() {
		return "Pain score: " + pain + "Description of Pain: " + painDescription;
	}
}
