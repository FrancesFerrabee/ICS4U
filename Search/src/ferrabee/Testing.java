package ferrabee;

import java.util.Scanner;

// Frances Ferrabee
// Started: Monday November 6th 2016
// This program lets the user search or sort a list of integers, strings or doubles.
public class Testing {
public static void main(String[] args)
{

Scanner scan= new Scanner(System.in);
String answer;
String answering;
int start;
int end; 
String answers;
// Creates variable and scanner

System.out.println("would you like to sort or to search?");
// asks the user if they want to sort values or find a value
answers= scan.nextLine();
if(answers.equalsIgnoreCase("search")|| answers.equalsIgnoreCase("to search"))
{
System.out.println("would you like an array of strings? Doubles? or integers?");
answering= scan.nextLine();
if(answering.equalsIgnoreCase("strings")|| answering.equalsIgnoreCase("string array"))
{
	String [] a= {"", "Purple", "Red","Blue", "Pink","Black", "Green", "Yellow", "Orange","White", "Gray"};
	// creates array a with string values
	System.out.println("The following words are in this array: Purple, Red, Blue,Pink,Black, Green, Yellow, Orange, White, and Gray");
	System.out.println("What is the color you are looking for?");
	String target= scan.nextLine();
	
	System.out.println("How would you like to find it by linear or binary search?");
	answer= scan.nextLine();
	// lets the user pick what form of search they would like

	if(answer.equalsIgnoreCase("binary")|| answer.equalsIgnoreCase("binary Search"))
	{
		System.out.println("Found at spot "	+ Searches.binarySearch(a, target));
		// calls method binarSearch and outputs where it is found in the array
	}
	
	else 
	{
		System.out.println("Found at spot "+ Searches.linearSearch(a, target));
		// calls method linearSearch and outputs where it is found in the array
	}
}
else if(answering.equalsIgnoreCase("doubles")|| answering.equalsIgnoreCase("double array"))
{
	double[] a= {1.0,2.2,4.4,7.8,9.2,10.1,14.9,20.2,29.9,42.2};
	// creates array a with double values
	System.out.println("The following numbers are in this array: 1.0,2.2,4.4,7.8,9.2,10.1,14.9,20.2,29.9,42.2");
	System.out.println("What is the number you are trying to look for?");
	double target= Double.parseDouble(scan.nextLine());

	System.out.println("How would you like to find it by linear or binary search?");
	answer= scan.nextLine();
	// lets the user pick what form of search they would like
	if(answer.equalsIgnoreCase("binary")|| answer.equalsIgnoreCase("binary Search"))
	{
		System.out.println("Found at spot "	+ Searches.binarySearch(a, target));
		// calls method binarSearch and outputs where it is found in the array
	}
	else 
	{
		System.out.println("Found at spot "+ Searches.linearSearch(a, target));
		// calls method linearSearch and outputs where it is found in the array
	}
}
else 
{
	int[] a= {1,2,4,7,9,10,14,20,29,42};
	// creates array a with integer values
	System.out.println("The following numbers are in this array:1,2,4,7,9,10,14,20,29,42 ");
	System.out.println("What is the number you are trying to look for?");
	int target= Integer.parseInt(scan.nextLine());

	System.out.println("How would you like to find it by linear or binary search?");
	answer= scan.nextLine();
	// lets the user pick what form of search they would like
	if(answer.equalsIgnoreCase("binary")|| answer.equalsIgnoreCase("binary Search"))
	{
		System.out.println("Found at spot "	+ Searches.binarySearch(a, target));
		// calls method binarSearch and outputs where it is found in the array
	}
	else 
	{
		System.out.println("Found at spot "+ Searches.linearSearch(a, target));
		// calls method linearSearch and outputs where it is found in the array
	}
}
}

else
{
	//Now we are in sort
	System.out.println("would you like an array of strings? Doubles? or integers?");
	answering= scan.nextLine();
	if(answering.equalsIgnoreCase("strings")|| answering.equalsIgnoreCase("string array"))
	{
		String a[]=new String[10];
		// creates a string array with 10 values
		System.out.println("Please enter 10 Strings you would like to sort");
		for (int i=0; i<10; i++)
		{
			System.out.println("Please, enter a string ");
			a[i]= scan.nextLine();
			// asks the user to enter 10 strings and puts it into an array
		}
		System.out.println("How would you like to sort? Insertion sort or selection sort");
		answer= scan.nextLine();
		// asks the user how they would like to sort there array
		if(answer.equalsIgnoreCase("insertion")|| answer.equalsIgnoreCase("insertion sort"))
		{
			
		}
		else
		{
			
		}
	}
	else if(answering.equalsIgnoreCase("doubles")|| answering.equalsIgnoreCase("double array"))
	{
		double a[]=new double[10];
		// creates a double array with 10 values
		System.out.println("Please enter 10 doubles you would like to sort");
		for (int i=0; i<10; i++)
		{
			System.out.println("Please, enter a double ");
			a[i]= Double.parseDouble(scan.nextLine());
			// asks the user to enter 10 doubles and puts it into an array
		}
		System.out.println("How would you like to sort? Insertion sort or selection sort");
		answer= scan.nextLine();
		// asks the user how they would like to sort there array
		if(answer.equalsIgnoreCase("insertion")|| answer.equalsIgnoreCase("insertion sort"))
		{
			
			Sort.insertionSort(a);
			// calls method insertionSort which sorts the numbers by insertion.
			System.out.print(" all sorted: ");
			for( int i=9; i>-1; i--)
			{
				System.out.print(" ,"+a[i]);
				// outputs all the values in the array now sorted
			}
			
		}
		else
		{
			Sort.selectionSort(a);
			// calls method selectionSort which sorts the numbers by slection.
			System.out.print(" all sorted: ");
			for( int i=0; i<a.length; i++)
			{
				System.out.print(" ,"+a[i]);
				// outputs all the values in the array now sorted
			}
		}
	}
	else
	{
		int a[]=new int[10];
		// creates an integer array with 10 values
		System.out.println("Please enter 10 integers you would like to sort");
		for (int i=0; i<10; i++)
		{
			System.out.println("Please, enter an integer ");
			a[i]= Integer.parseInt(scan.nextLine());
			// asks the user to enter 10 integers and puts it into an array
		}
		System.out.println("How would you like to sort? Insertion sort or selection sort");
		answer= scan.nextLine();
		// asks the user how they would like to sort there array
		if(answer.equalsIgnoreCase("insertion")|| answer.equalsIgnoreCase("insertion sort"))
		{
			Sort.insertionSort(a);
			// calls method insertionSort which sorts the numbers by insertion.
			System.out.print(" all sorted: ");
			for( int i=9; i>-1; i--)
			{
				System.out.print(" ,"+a[i]);
				// outputs all the values in the array now sorted
			}
			
		}
		else
		{
			Sort.selectionSort(a);
			// calls method slectionSort which sorts the numbers by insertion.
			System.out.print(" all sorted: ");
			for( int i=0; i<a.length; i++)
			{
				System.out.print(" ,"+a[i]);
				// outputs all the values in the array now sorted
			}
			
		}
		
	}
}


}
}
 