package cerealHowTo;

public class cerealHowTo {

	public static void main(String[] args) {
		//fill null elements when re-supplied
		
		String ingredients [][] = {
				{"cereal","pantry"},
				{"milk",null},	
		};
		
		String supplies [][] = {
				{"bowl","cabinet"},
				{"spoon",null}	
		};
		
		int i=0;
		do {
			if (ingredients[i][1] != null) {
				System.out.println(String.format("Get %s from %s", ingredients[i][0],ingredients[i][1]));
				i++;
			}else {
				System.out.println("Need to buy "+ingredients[i][0]);
				break;
			}
			if (i==ingredients.length) {
				int j=0;
				do {
					if (supplies[j][1] != null) {
						System.out.println(String.format("Get %s from %s", supplies[j][0],supplies[j][1]));
						j++;
					}else {
						System.out.println("Need to wash "+supplies[j][0]);
						break;
					}
					if (j==supplies.length) {
						for (int y = 0; y<ingredients.length;y++) {
							System.out.println(String.format("Pour %s into bowl",ingredients[y][0]));
						}
						System.out.println("Eat your cereal with a spoon");
					}
				}while(j<supplies.length);
			}
		}while(i<ingredients.length);
	}
}
