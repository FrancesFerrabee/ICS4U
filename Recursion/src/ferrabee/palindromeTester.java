package ferrabee;
import java.util.Scanner;
public class palindromeTester {
// By:Frances Ferrabee
// Date:September 19th 2016
// This program takes a word and tests if its a palindrome.
    public static boolean Palindrome(String number)
    {  
    int numberLength= number.length()-1;
    
        if(number.length() == 0 || number.length() == 1)
            return true; 
        // if there is only 1 or no letters the palindrome will be true
        if(number.charAt(0) == number.charAt(numberLength))
        	// checks if the last and first number are the same
        return Palindrome(number.substring(1,numberLength));
        //returns a part of the word between length 1 and the numbers length.. makes the length go down by one and goes back up to the top.
        return false;
        // returns that it is not a palindrome 
    }

    public static void main(String[]args)
    { 	
    	boolean again =true;
    	
    	while( again==true)
    	{
    	
	    	//For capturing user input
	        Scanner myScanner = new Scanner(System.in);
	        System.out.println("Enter a number to see if it is a palindrome:");
	        String answer = myScanner.nextLine();
	        // imputing numbers
	        // If Palindrome returns true then the string is
	         //palindrome otherwise it is not
	         
	        if(Palindrome(answer))
	        {
	            System.out.println("That is a palindrome");
	            // prints out that it is a palindrome
	        }
	        else
	        {
	            System.out.println("That is not a palindrome");
	            //prints out that it is not a palindrome
	        }
	        System.out.println("Would you like to play again? Y or N");
	        String againAnswer = myScanner.nextLine();
	        if( againAnswer.equalsIgnoreCase("n"))
	        {
	        	again=false;
	        	// stops the loop
	        }
	        else if (againAnswer.equalsIgnoreCase("y"))
	        {
	        	again= true;
	        	// continues the loop
	        }
	   
	        	
    	}

    }
}

