import java.util.Random;
import java.util.Scanner;

class Roll_Dice{
    public static void main(String args[]){
	Random rand1 = new Random();
	Random rand2 = new Random();
	Random rand3 = new Random();
	
	int dice1 =rand1.nextInt(7);
	int dice2 =rand2.nextInt(7);
	int dice3 =rand3.nextInt(7);
	
	int total =dice1+dice2+dice3;
	Scanner scan = new Scanner(System.in);
	String name;


	System.out.println("What is your name?");
	System.out.print(">");
	name = scan.next();
	System.out.println("Hello, "+ name +"!");
	    System.out.println("Rolling the dice...");
	    System.out.println("Die 1:" + dice1);
	    System.out.println("Die 2:" + dice2);
	    System.out.println("Die 3:" + dice3);
		System.out.println("Total value is: "+ total);
		if(total>7){
		    System.out.println(name +" won");   
		}
		else System.out.println(name +" lost");
	
    }
}
