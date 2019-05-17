package classExercise3;

public class Lion extends Cat {
	
	private int maneLength;
	private String name;

	public Lion(Boolean furred, Boolean tailed) {
		super(furred, tailed);
	}

	public Lion(Boolean furred, Boolean tailed, int maneLength, String name) {
		super(furred, tailed);
		this.maneLength = maneLength;
		this.name = name;
	}

	public int getManeLength() {
		return maneLength;
	}

	public Lion setManeLength(int maneLength) {
		this.maneLength = maneLength;
		return this;
	}

	public String getName() {
		return name;
	}

	public Lion setName(String name) {
		this.name = name;
		return this;
	}

}
