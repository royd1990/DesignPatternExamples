package Factory;
import java.util.Scanner;
public class ToyShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ToyFactory t = new FactoryUnitVegas();
		Toy newToy;
		
		Scanner userInput = new Scanner(System.in);		
		System.out.print("What type of toy? (C/M)");
		if (userInput.hasNextLine()){
			String typeOfToy = userInput.nextLine();
			System.out.println("Okay Sir. Confirm your choice as "+typeOfToy);
			newToy = t.makeToy(typeOfToy);
			System.out.println("Your toy is on the way");
			if(newToy!=null){
				newToy.describeToy();
			}
		}
		else{
			System.out.println("Wrong input");
		}

	}

}
