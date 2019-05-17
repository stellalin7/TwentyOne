package classExercise3;

public class Cat {
	
	private Boolean furred;
	private Boolean tailed;
	
	public Cat(Boolean furred, Boolean tailed) {
		this.furred = furred;
		this.tailed = tailed;
	}
	
	public Boolean getFurred() {
		return furred;
	}
	public Cat setFurred(Boolean furred) {
		this.furred = furred;
		return this;
	}
	public Boolean getTailed() {
		return tailed;
	}
	public Cat setTailed(Boolean tailed) {
		this.tailed = tailed;
		return this;
	}
}
