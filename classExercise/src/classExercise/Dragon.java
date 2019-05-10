package classExercise;

public class Dragon {
	
	private String name;
	private boolean fireBreathing;
	private int wingSpan;
	private int height;
	private boolean friendly;

	public Dragon(String name, boolean fireBreathing, int wingSpan, int height, boolean friendly) {
		this.name = name;
		this.fireBreathing = fireBreathing;
		this.wingSpan = wingSpan;
		this.height = height;
		this.friendly = friendly;
	}
	
	public Dragon(String name) {
		this.name = name;
		this.fireBreathing = true;
		this.wingSpan = 20;
		this.height = 15;
		this.friendly = true;
	}
	
	@Override
	public String toString() {
		return "Dragon [name=" + name + ", fireBreathing=" + fireBreathing + ", wingSpan=" + wingSpan + ", height="
				+ height + ", friendly=" + friendly + "]";
	}
	
	public static void main(String[] args) {
		Dragon puff = new Dragon("Puff the Magic Dragon");
		System.out.println(puff.toString());
		System.out.println(puff.getName() + " is growing: "+puff.growHeight(5).growWingSpan(10).toString());
	}

	public String getName() {
		return name;
	}

	public Dragon setName(String name) {
		this.name = name;
		return this;
	}

	public boolean isFireBreathing() {
		return fireBreathing;
	}

	public Dragon setFireBreathing(boolean fireBreathing) {
		this.fireBreathing = fireBreathing;
		return this;
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public Dragon setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
		return this;
	}
	
	public Dragon growWingSpan(int growth) {
		this.wingSpan += growth;
		return this;
	}

	public Dragon growHeight(int growth) {
		this.height += growth;
		return this;
	}
	
	public int getHeight() {
		return height;
	}

	public Dragon setHeight(int height) {
		this.height = height;
		return this;
	}

	public boolean isFriendly() {
		return friendly;
	}

	public Dragon setFriendly(boolean friendly) {
		this.friendly = friendly;
		return this;
	}
	
	public Dragon() {
		this.name = "Puff";
		this.fireBreathing = true;
		this.wingSpan = 20;
		this.height = 15;
		this.friendly = true;

	}


}
