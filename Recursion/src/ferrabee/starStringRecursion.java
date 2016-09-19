package ferrabee;

import java.util.Scanner;
//By:Frances Ferrabee
//September 14th 2016
//This program takes a number from the user and puts that number to base 2 and prints it out in stars.
public class starStringRecursion {

	public static void starString (int num)
	{
		
		if (num>0)
		{
			// if the number entered is less than 0.
			int k= (int)(Math.pow(2,num));
			// this calculates 2 to the power of the number entered and puts it into k
			starString(num-1);
			// goes back to the top of the code but now the number is one less.
			while(k>0)
			{
				System.out.print("*");
				k--;
				// prints out the value of k recorded.
			}
			System.out.println();
			// skips a line
			
		}
		else if (num==0)
		{
			System.out.println("*");
			// so that if they enter 0 there is one star.
		}
		
	}
	public static void main(String[]args)
	{
		Scanner myInput= new Scanner(System.in);
		System.out.println("Please enter a number, it will be the power of base 2.");
		int n= Integer.parseInt(myInput.nextLine());
		// gets input from user
		if (n>0)
		{
			starString(n);
			// goes to method to calculate the stars
		}
		else
		{
			System.out.println("Can't calculate");
			
		}
		
	}
	


	
	
}