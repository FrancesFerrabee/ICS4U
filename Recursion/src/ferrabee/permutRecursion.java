package ferrabee;

import java.util.Scanner;
//By:Frances Ferrabee
//Date:September 15th 2016
// This program calculates the number of permutations when the user puts in an r and n value.
public class permutRecursion {

	public static void permut (int n, int r)
	{
		int topOfEquation= Factorial(n);
		int bottomOfEquation= Factorial(n-r);
		// sends parts of the equation to the factorial
		System.out.println(n);
		System.out.println(r);
		// prints the n and r
		System.out.println("There are " +topOfEquation/bottomOfEquation+ " permutations");
		// puts the 2 halves of the equation together and outputs the permutations.
	}
	public static int Factorial(int num)
	{
		if (num==0)
		{
			return 0;
		}
		else if( num==1)
		{
			return 1;
		}
		else
		{
			return num*Factorial(num-1);
			// comes up with the answer to the factorial and returns it.
		}
	}
	public static void main(String[]args)
	{
		Scanner myInput= new Scanner(System.in);
		System.out.println("Please enter n");
		int n= Integer.parseInt(myInput.nextLine());
		System.out.println( "Please enter r");
		int r= Integer.parseInt(myInput.nextLine());
		// gets the value of n and r from the user
		permut(n,r);
		// sends n and r to permut
	}
	
	


}
