import java.util.Random;

class Roll_Dice{
    public static void main(String args[]){
	Random rand1 = new Random();
	Random rand2 = new Random();
	
	int dice1 =rand1.nextInt(7);
	int dice2 =rand2.nextInt(7);
	int total =dice1+dice2; 
	System.out.println("Rolling the dice...");
	System.out.println("Die 1:" + dice1);
	System.out.println("Die 2:" + dice2);
	System.out.println("Total value: "+ total);
	
    }
}
