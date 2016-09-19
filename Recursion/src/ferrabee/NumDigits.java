package ferrabee;
import java.util.Scanner;
public class NumDigits {

	// By: Frances Ferrabee
	// Date: September 14 2016
	// This program allows the user to enter in a number and tells the user how many digits the number has.
	public static void numDigitsNegative (long num, int c)
	{	// this is the code that is run if the number entered is negative
		int j=0;
		
		if (num<0)
		{
			numDigitsNegative(num+1,c+1);
			// this increases the number entered by 1.
			// if the number is less than 0 this adds a number to the counter. 
			
		}
		else
		{
		while(c>0)
		{// this counts how many times the number has to be divided by 10 to equal 0
			j++;
			c=c/10;
		}
		System.out.println(j);
		// outputs number of digits
		}
	}
	public static void numDigitsPossitive (long num, int c)
	{	// this is the code that is run if the number entered is possitive
		int j=0;
		
		if (num>0)
		{
			numDigitsPossitive(num-1,c+1);
			// this decreases the number entered by 1.
		   // if the number is less than 0 this adds a number to the counter. 
		}
		else
		{
		while(c>0)
		{
			j++;
			c=c/10;
			// this counts how many times the number has to be divided by 10 to equal 0
		}
		System.out.println(j);
		// outputs number of digits
		}
	}
	public static void main(String[]args)
	{
		Scanner myInput= new Scanner(System.in);
		System.out.println("Please enter a number, your number must be less than 8800");
		long q= Long.parseLong (myInput.nextLine());
		// gets a number from the user called q
		if (q>0)
		{
		numDigitsPossitive(q,0);
		}
		else if (q<0)
		{
			numDigitsNegative(q,0);
		}
		else
		{
			System.out.println("1");
		}
		// determines if the number is greater then 0, less then 0, or 0 and calls code.
	}
	


}