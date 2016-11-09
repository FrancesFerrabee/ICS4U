package ferrabee;

import java.util.Scanner;

public class testing {
public static void main(String[] args)
{

Scanner scan= new Scanner(System.in);
String answer;
String answering;
int start;
int end; 

System.out.println("would you like an array of strings? Doubles? or integers?");
answering= scan.nextLine();
if(answering.equalsIgnoreCase("strings")|| answering.equalsIgnoreCase("string array"))
{
	String [] a= {"", "Purple", "Red","Blue", "Pink","Black", "Green", "Yellow", "Orange","White", "Gray"};
	System.out.println("The following words are in this array: Purple, Red, Blue,Pink,Black, Green, Yellow, Orange, White, and Gray");
	System.out.println("What is the color you are looking for?");
	String target= scan.nextLine();
	
	System.out.println("How would you like to find it by linear or binary search?");
	answer= scan.nextLine();

	if(answer.equalsIgnoreCase("binary")|| answer.equalsIgnoreCase("binary Search"))
	{
		System.out.println("Found at spot "	+ searches.binarySearch(a, target));
	}
	else 
	{
		System.out.println("Found at spot "+ searches.linearSearch(a, target));
	}
}
else if(answering.equalsIgnoreCase("doubles")|| answering.equalsIgnoreCase("double array"))
{
	double[] a= {1.0,2.2,4.4,7.8,9.2,10.1,14.9,20.2,29.9,42.2};
	
	System.out.println("The following numbers are in this array: 1.0,2.2,4.4,7.8,9.2,10.1,14.9,20.2,29.9,42.2");
	System.out.println("What is the number you are trying to look for?");
	double target= Double.parseDouble(scan.nextLine());

	System.out.println("How would you like to find it by linear or binary search?");
	answer= scan.nextLine();

	if(answer.equalsIgnoreCase("binary")|| answer.equalsIgnoreCase("binary Search"))
	{
		System.out.println("Found at spot "	+ searches.binarySearch(a, target));
	}
	else 
	{
		System.out.println("Found at spot "+ searches.linearSearch(a, target));
	}
}
else 
{
	int[] a= {1,2,4,7,9,10,14,20,29,42};
	
	System.out.println("The following numbers are in this array:1,2,4,7,9,10,14,20,29,42 ");
	System.out.println("What is the number you are trying to look for?");
	int target= Integer.parseInt(scan.nextLine());

	System.out.println("How would you like to find it by linear or binary search?");
	answer= scan.nextLine();

	if(answer.equalsIgnoreCase("binary")|| answer.equalsIgnoreCase("binary Search"))
	{
		System.out.println("Found at spot "	+ searches.binarySearch(a, target));
	}
	else 
	{
		System.out.println("Found at spot "+ searches.linearSearch(a, target));
	}
}


}
}
 