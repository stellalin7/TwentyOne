package classExercise;


public class Car {

	private String make;
	private String model;
	private int numberDoors;
	private int speed;
	private int mpg;
	
	private static final int MAX_NUMBER_DOORS = 6;
	private static final int MIN_NUMBER_DOORS = 1;
	private static final int MIN_MPG = 25;
	
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
		if (numberDoors > MIN_NUMBER_DOORS && numberDoors < MAX_NUMBER_DOORS) {
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
			this.mpg = MIN_MPG;
		}
		else {
			System.out.println("The minimum mpg is "+MIN_MPG);
			this.mpg=MIN_MPG;
		}
		return this;
	}
	
	public static boolean mpgEqual(Car c1, Car c2) {
		return c1.getMpg()==c2.getMpg();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (mpg != other.mpg)
			return false;
		if (numberDoors != other.numberDoors)
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", numberDoors=" + numberDoors + ", speed=" + speed + ", mpg="
				+ mpg + "]";
	}
	
	public static void main(String[] args) {
		Car prius = new Car();
		System.out.println(prius.toString());
		Car insight = new Car("Honda","Insight",2,45,45);
		System.out.println(insight.toString());
		
		if (mpgEqual(prius, insight)) {
			System.out.println(String.format("The %s %s and %s %s are equal in mpg.", prius.make, prius.model, insight.make, insight.model));
		}
		//System.out.println(prius.setSpeed(70).setMpg(40).toString());
		System.out.println(insight.setNumberDoors(1).toString());
		System.out.println(prius.accelerate(20).toString());
		System.out.println(prius.brake().toString());
		System.out.println(insight.setMpg(1).toString());
	}

	

	


}
