package classExercise;

public class Human {
	
	private String firstName = "John";
	private char middleInitial= 'X';
	private String lastName = "Doe";
	private int age =21;
	private String gender= "non-binary";
	
	public Human(String firstName, char middleInitial, String lastName,  int age, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInitial = middleInitial;
		this.age = age;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", middleInitial=" + middleInitial+ ", lastName=" + lastName +  ", age=" + age + ", gender=" + gender + "]";
	}

	public static void main(String[] args) {
		Human person = new Human("Stella",'S',"Lin",43,"Female");
		System.out.println(person.toString());
		System.out.println(person.setAge(44).toString());
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
		this.age = age;
		return this;
	}

	public String getGender() {
		return gender;
	}

	public Human setGender(String gender) {
		this.gender = gender;
		return this;
	}
	
	
	
	public Human() {
	}

	
}
