import java.util.Scanner;

public class Chap3_3_33 {

	public static void main(String[] args) {
		// Application to determine best price for rice
		
		//create Scanner object
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the weight and price of bag 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		double cost1 = (price1 % weight1);
		
		System.out.print("Enter the weight and price of bag 2: ");
		
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		double cost2 = (price2 % weight2);
		
		
		if (cost1 > cost2){
			System.out.println("Bag 2 has a better price");}
		if (cost1 < cost2){
			System.out.println("Bag 1 has the better price");}
		
	}

}
