package ferrabee;
import java.util.Scanner;
public class FromPrefixToPostfix {

	public static void main(String[]args)
	{
		
		Scanner myInput= new Scanner(System.in);
		System.out.println("Please enter numbers in prefix notation to be turned into postfix notation");
		String prefix= myInput.nextLine();
		String temp;
		int numberCount=1;
	    postfix (prefix,numberCount, temp);
		
	}
	public static void postfix(String s,int numCount ,String rest)
	{
		String first;
		String second;
		String temp1;
		String temp2;
		String plusOrMinus;
		System.out.println("in:" + s);
		if (s.charAt(numCount)== '+' )
		{
			postfix(numCount+1, first,temp1);
			postfix(temp1,second,temp2);
			plusOrMinus= "+";
			System.out.println(temp2);
			rest= temp2;
		}
		else if ( s.charAt(numCount)=='-')
		{
			postfix(numCount+1, first, temp1);
			postfix(temp1, second, temp2);
			plusOrMinus="-";
			rest= temp2;
		}
		else
		{
			plusOrMinus= s.charAt(numCount);
			if(s.length()>1)
			{
				rest= s;
			}
			else 
			{
				rest= "";
			}
		}
		System.out.println("out:"+ first + " " + second + plusOrMinus+ ":"+ rest);
	}
}


