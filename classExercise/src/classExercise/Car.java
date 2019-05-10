package classExercise;


public class Car {

	private String make;
	private String model;
	private int numberDoors;
	private int speed;
	private int mpg;

	public Car(String make, String model, int numberDoors, int speed, int mpg) {
		this.make = make;
		this.model = model;
		this.numberDoors = numberDoors;
		this.speed = speed;
		this.mpg = mpg;
	}
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", numberDoors=" + numberDoors + ", speed=" + speed + ", mpg="
				+ mpg + "]";
	}
	
	public static void main(String[] args) {
		Car prius = new Car();
		System.out.println(prius.toString());
		//System.out.println(prius.setSpeed(70).setMpg(40).toString());
		System.out.println(prius.accelerate(20).toString());
		System.out.println(prius.brake().toString());
	}

	public String getMake() {
		return make;
	}

	public Car setMake(String make) {
		this.make = make;
		return this;
	}

	public String getModel() {
		return model;
	}

	public Car setModel(String model) {
		this.model = model;
		return this;
	}

	public int getNumberDoors() {
		return numberDoors;
	}

	public Car setNumberDoors(int numberDoors) {
		this.numberDoors = numberDoors;
		return this;
	}

	public int getSpeed() {
		return speed;
	}

	public Car setSpeed(int speed) {
		this.speed = speed;
		return this;
	}
	
	public Car accelerate(int rev) {
		this.speed+=rev;
		this.mpg -= rev/5;
		return this;
	}
	
	public Car brake() {
		this.speed -= 10;
		this.mpg += 2;
		return this;
	}

	public int getMpg() {
		return mpg;
	}

	public Car setMpg(int mpg) {
		this.mpg = mpg;
		return this;
	}
	
	public Car() {
		this.make = "Toyota";
		this.model = "Prius";
		this.numberDoors =5;
		this.speed = 50;
		this.mpg = 45;
	}

}
