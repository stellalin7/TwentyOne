package classExercise3;

public class Siamese extends Cat {

	private String eyecolor;
	private boolean loud;
	
	public Siamese(Boolean furred, Boolean tailed) {
		super(furred, tailed);
		this.eyecolor = "blue";
		this.loud = true;
	}

	public String getEyecolor() {
		return eyecolor;
	}

	public boolean isLoud() {
		return loud;
	}
	

}
