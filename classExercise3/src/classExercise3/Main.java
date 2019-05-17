package classExercise3;

public class Main {

	public static void main(String[] args) {
		Lion leon = new Lion(true,true,20,"Leon");
		System.out.println(leon.getName()+" is getting a haircut.");
		System.out.println(leon.getName()+ "'s mane length was "+leon.getManeLength()+" inches.");
		int newManeLength = 10;
		System.out.println(leon.getName()+ "'s mane length is now "+leon.setManeLength(newManeLength).getManeLength()+" inches.");
		String newName = "Leo";
		System.out.println(leon.getName()+" is getting a new name.  His new name is "+leon.setName(newName).getName());
		
		
		Siamese sam = new Siamese(true,true);
		System.out.println("All Siamese have "+sam.getEyecolor()+" eyes.");
		System.out.println("It is "+sam.isLoud()+" that all Siamese are loud.");
	
		System.out.println(5/0);
	}

}
