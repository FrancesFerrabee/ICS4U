package ferrabee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


// By: Frances Ferrabee
// Date due:
// Date Started: September 27th 2016
// this program gets the user to: add or remove a student, if they want to print out a student or all students inputed, 
public class schoolSystem {
	
	static ArrayList<Student> studrecs= new ArrayList<Student>();
	// an array for all the students in the program

	public static void addStudent()
	{
		Scanner myInput= new Scanner(System.in);
		studrecs.add(new Student());
		// makes the person inputing info student1
		// sets scanner
		
		System.out.println("please enter your first name");
		// gets first name from user
		String fname= myInput.nextLine();
		studrecs.get(studrecs.size()-1).setFirstName(fname);
		// sends the info back to class Student
		
		System.out.println("please enter your last name");
		// gets last name from user
		String lname= myInput.nextLine();
		studrecs.get(studrecs.size()-1).setLastName(lname);
		// sends the info back to class Student
		
		System.out.println("please enter your street address");
		// gets address from user
		String aname= myInput.nextLine();
		studrecs.get(studrecs.size()-1).setStreetAddress(aname);
		// sends the info back to class Student
		
		
		System.out.println("please enter city you live in");
		// gets city from user
		String cname= myInput.nextLine();
		studrecs.get(studrecs.size()-1).setCity(cname);
		// sends the info back to class Student
		
		System.out.println("please enter province you live in");
		// gets province from user
		String provname= myInput.nextLine();
		studrecs.get(studrecs.size()-1).setProvName(provname);
		// sends the info back to class Student
		
		
		System.out.println("please enter your postal code");
		// gets postal code from user
		String postname= myInput.nextLine();
		try {
			studrecs.get(studrecs.size()-1).setPostalName(postname);
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// sends the info back to class Student
										
									
		
		
		
		System.out.println("please enter your phone number");
		// gets phone number from user	
		long nname= Long.parseLong(myInput.nextLine());
		try {
			studrecs.get(studrecs.size()-1).setNumName(nname);
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// sends the info back to class Student
	
		
		System.out.println("please enter your birthday");
		// gets birthday from user
		String day= myInput.nextLine();
		studrecs.get(studrecs.size()-1).setDateName(day);
		// sends the info back to class Student
		
		//sends the student to the array

	}
	
public static void printInfo(Student student1){
	System.out.println(student1.getFirstName());
	System.out.println(student1.getLastName());
	System.out.println(student1.getStreetAddress());
	System.out.println(student1.getCity());
	System.out.println(student1.getProvName());
	System.out.println(student1.getPostalName());
	System.out.println(student1.getNumName());
	System.out.println(student1.getDateName());
	// prints out all the information of the student of the users choice
}

public static void printAllInfo()
{
	for(int i=0; i<studrecs.size(); i++)
		// goes through the entire list of students created
	{
		int j=i+1;
		System.out.println("Student: "+j);
		printInfo(studrecs.get(i));
		// calls the printInfo method to print the information of the i student
		System.out.println("");
	}
		
}

public static void removeStudent(int a)
{
	studrecs.remove(a);
	// removes the student chosen
}

	public static void main(String[]args)
	{
		boolean quit= false;
		Scanner myInput= new Scanner(System.in);
		int number;
	
	do{
		System.out.println("Welcome to the starting menu");
		System.out.println("What would you like to do?");
		System.out.println("1: add new student");
		System.out.println("2: print student info");
		System.out.println("3: Print all students info");
		System.out.println("4: Remove a student");
		System.out.println("5: Sort the student records");
		System.out.println("10: Quit");
		// creates a list of things for the user to choose between
		int answer= Integer.parseInt(myInput.nextLine());
	
		if( answer==1)
		{
			addStudent();
		}
		else if(answer==2)
		{
			System.out.println("which student would you like to print? Please give the number. The first number you entered has the number of 300000001");
			int num= Integer.parseInt(myInput.nextLine());
			boolean choiceselection= false;
			while (choiceselection==false){
			if( num>300000000){
			
				choiceselection= true;
			printInfo(studrecs.get(num-300000001));
			choiceselection= true;
			}
			else
			{
			}
			// gets the student the user wants and sends it to the method
			}
		}
		else if (answer==3)
		{
			System.out.println("All students info:");
			printAllInfo();
			// goes to the print all student method
		}
		else if(answer==4)
		{
			System.out.println("which student would you like to remove? Please give the number. The first number you entered has the number of 300000001");
			int choice= Integer.parseInt(myInput.nextLine());
			boolean choiceselection=false;
			while(choiceselection==false){
			if(choice>300000001)
			{
				choiceselection= true;
				removeStudent(choice-300000001);
				choiceselection= true;
			}
			else
			{
				
			}
			}
			// gets the student the user wants to remove 
		}
		else if(answer==10)
		{
			System.out.println("bye");
			quit= true;
			// exits the program
		}
			
		}
	while( quit= true);
	{
		System.exit(0);
	}
	}

public static void sortStudents()
{
	Collections.sort(studrecs);
	// Sorts the students
}

}