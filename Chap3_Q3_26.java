import java.util.Scanner;

public class Chap3_Q3_26 {

	public static void main(String[] args) {
		// Application to determine if a number is divisible by 5 and 6
		//create Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double number = input.nextDouble();
		double x = (number % 5);
		double y = (number % 6);
		
		if (x == 0 && y == 0){
			System.out.println("Is " + number + " divisible by 5 and 6? True");}
		else 
		if (x ==0 && y!=0){
			System.out.println("Is " + number + " divisible by 5 or 6? True");}
			
		if (x!=0 && y==0){
			System.out.println("Is " + number + " divisible by 5 or 6? True");}
		
		if (x!=0 && y==0 || x==0 && y!=0){
			System.out.println("Is " + number + " divisible by 5 or 6, but not both? True");}
		
		else
		if (number % 5 !=0 && number %6 !=0){
		System.exit(0);}
		}
		
		
		
}
	

	


