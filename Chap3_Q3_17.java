import java.util.Scanner;
import java.util.Random;
public class Chap3_Q3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String picked=null;
		  String computer=null;
		 
		 
		  //Create scanner object	
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter a number 0=for Rock, 1=Paper, 2=Scissors: ");
		  int player = input.nextInt();
		  
		  //Generate random number
		  int computer1 = (int)(Math.random() * 3);
				 
		  if (computer1==0) computer = "rock";
		  if (computer1==1) computer = "paper";
		  if (computer1==2) computer = "scissors";
		  
		  if (player==0) picked = "rock";
		  if (player==1) picked = "paper";
		  if (player==2) picked = "scissors";
		  
		 
	  	if (computer1==player){
	  		  System.out.println("Tie game " + "The computer picked " + computer + ". You picked " + picked + ".");}
	  	 
	  	if (computer1==0 && player==1){ 
	  			System.out.println("You win! " + "The computer picked " + computer + ". You picked " + picked + ".");}
	  	  
	  	if (computer1==0 && player==2){
	  		    System.out.println("You lose! " + "The computer picked " + computer + ". You picked " + picked + ".");}
	  	
	    if (computer1==1 && player==0){
		  		System.out.println("You Win! " + "The computer picked " + computer + ". You picked " + picked + ".");}
	
		if (computer1==1 && player==2){
			    System.out.println("You Win! " + "The computer picked " + computer + ". You picked " + picked + ".");}
	   
		if (computer1 ==2 && player==0){
				System.out.println("You Win! " + "The computer picked " + computer + ". You picked " + picked + ".");}
		if (computer1==2 && player==1){
				System.out.println("You Win! " + "The computer picked " + computer + ". You picked " + picked + ".");
		}
		}
		}  
	  	  
	  	 
	  	
	
				        
	  
	
	


