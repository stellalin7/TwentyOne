package classInheritanceExercise;

public abstract class Mammal {
	private final static boolean MILK_PRODUCING = true;
	private boolean liveBearing;
	private boolean venomProducing;
	private float normalBodyTempF;
	private int incubationMonths;
	public static boolean isMilkProducing() {
		return MILK_PRODUCING;
	}
	public boolean isLiveBearing() {
		return liveBearing;
	}
	public boolean isVenomProducing() {
		return venomProducing;
	}
	public float getNormalBodyTempF() {
		return normalBodyTempF;
	}
	public int getIncubationMonths() {
		return incubationMonths;
	}

}
