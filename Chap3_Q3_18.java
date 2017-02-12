import java.util.Scanner;
public class Chap3_Q3_18 {

	public static void main(String[] args) {
		// Application to determine Shipping costs
		
		//create Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight of your package: ");
		double weight = input.nextDouble();
		
		if (weight>0 && weight<=1){
			System.out.println("The shipping cost is $3.50");}
		if (weight>1 && weight <=3){
			System.out.println("The shipping cost is $5.50");}
		if (weight>3 && weight <=10){
			System.out.println("The shipping cost is $8.50");}
		if (weight>10 && weight <=20){
			System.out.println("The shipping cost is $10.50");}
		if (weight>50){
			System.out.println("The package cannot be shipped");}
		}
		
		
}
	


