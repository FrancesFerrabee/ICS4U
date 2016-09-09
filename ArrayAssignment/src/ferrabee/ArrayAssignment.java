package ferrabee;
import java.util.*;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	System.out.println("Rolling 2 dice 10,000 times to see what you get:");
	
	Scanner userInput= new Scanner(System.in);
	int[] dice= new int[11];
	for (int number=0; number<10000;number++)
	{
		int randomNumber= (int)(Math.random()*11);
		dice[randomNumber]= dice[randomNumber] + 1;
		
	}
	for( int number2=2; number2<11; number2++)
	{
		System.out.println(number2+"-"+ dice[number2]);
	}
	
	}
}