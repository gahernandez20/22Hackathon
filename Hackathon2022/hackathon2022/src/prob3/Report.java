package prob3;

public abstract class Report {
	protected int scale;
	protected String description;
	
	public Report (int scale, String description) {
		this.scale = scale;
		this.description = description;
	}
	public void setScale (int scale) {
		this.scale = scale;
	}
	
	public int getScale() {
		return scale;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String toString() {
		return "Intensity of problem(1-10)" + scale + "Description of problem:" + description;
	}
}

