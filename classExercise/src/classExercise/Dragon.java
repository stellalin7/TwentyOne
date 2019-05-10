package classExercise;

public class Dragon {
	
	private String name = "Puff";
	private boolean fireBreathing = true;
	private int wingSpan = 20;
	private int height = 15;
	private boolean friendly = true;

	public Dragon(String name, boolean fireBreathing, int wingSpan, int height, boolean friendly) {
		this.name = name;
		this.fireBreathing = fireBreathing;
		this.wingSpan = wingSpan;
		this.height = height;
		this.friendly = friendly;
	}
	
	@Override
	public String toString() {
		return "Dragon [name=" + name + ", fireBreathing=" + fireBreathing + ", wingSpan=" + wingSpan + ", height="
				+ height + ", friendly=" + friendly + "]";
	}
	
	public static void main(String[] args) {
		Dragon puff = new Dragon();
		System.out.println(puff.toString());
		System.out.println(puff.setName("Puff the Magic Dragon").toString());

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
	
	public Dragon() {}


}
