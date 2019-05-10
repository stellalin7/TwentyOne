package classExercise;

public class Human {
	
	private String firstName;
	private char middleInitial;
	private String lastName;
	private int age;
	private String gender;
	
	public Human() {
		this.firstName = "John";
		this.middleInitial= 'X';
		this.lastName = "Doe";
		this.age =21;
		this.gender= "non-binary";
		
	}
	
	public Human(String firstName, char middleInitial, String lastName,  int age, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInitial = middleInitial;
		this.age = age;
		this.gender = gender;
	}
	
		
	
	public String getFirstName() {
		return firstName;
	}

	public Human setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public Human setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public char getMiddleInitial() {
		return middleInitial;
	}

	public Human setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Human setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
		else {
			this.age = 0;
		}
		return this;
	}
	
	public Human birthDay() {
		this.age +=1;
		return this;
	}

	public String getGender() {
		return gender;
	}

	public Human setGender(String gender) {
		this.gender = gender;
		return this;
	}
	
	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", middleInitial=" + middleInitial+ ", lastName=" + lastName +  ", age=" + age + ", gender=" + gender + "]";
	}

	public static void main(String[] args) {
		Human person = new Human();
		System.out.println(person.toString());
		System.out.println(person.setAge(-1).toString());
		System.out.println(person.birthDay().toString());
	}


	
}
