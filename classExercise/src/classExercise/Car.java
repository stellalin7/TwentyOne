package classExercise;


public class Car {

	private String make;
	private String model;
	private int numberDoors;
	private int speed;
	private int mpg;
	
	public Car() {
		this.make = "Toyota";
		this.model = "Prius";
		this.numberDoors =5;
		this.speed = 50;
		this.mpg = 45;
	}

	public Car(String make, String model, int numberDoors, int speed, int mpg) {
		this.make = make;
		this.model = model;
		this.numberDoors = numberDoors;
		this.speed = speed;
		this.mpg = mpg;
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
		if (numberDoors > 1 && numberDoors < 6) {
			this.numberDoors = numberDoors;
		}
		else {
			System.out.println(numberDoors + " is not a valid number of doors for a street-legal car.");
			this.numberDoors = 4;
		}
		return this;
	}

	public int getSpeed() {
		return speed;
	}

	public Car setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
		else {
			this.speed = 0;
		}
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

	private Car setMpg(int mpg) {
		if (mpg>25) {
			this.mpg = mpg;
		}
		else {
			System.out.println("The minimum mpg is 25.");
			this.mpg=25;
		}
		return this;
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
		System.out.println(prius.setNumberDoors(1).toString());
		System.out.println(prius.accelerate(20).toString());
		System.out.println(prius.brake().toString());
		System.out.println(prius.setMpg(1).toString());
	}


}
