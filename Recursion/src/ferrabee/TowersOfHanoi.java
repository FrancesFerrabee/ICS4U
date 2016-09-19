package ferrabee;
import java.util.Scanner;
public class TowersOfHanoi {
// By: Frances Ferrabee
// Date: September 19 2016
// This program shows where the user should move the blocks in the tower of hanoi
	public static void Solve(int N,String Src,String Aux,String Dst)
	{
		if(N==0)
		{
			System.out.println("");
			// if the value of N is 0 do nothing
		}
		else
		{
			Solve(N-1,Src,Dst,Aux);
			System.out.print("Move from "+ Src+ " to "+ Dst);
			// tells the user where they should move
			Solve(N-1,Aux,Src,Dst);
			// switches the order of blocks
			// puts the number of blocks down one.
		}
	}
	public static void main(String[]args)
	{
		Scanner myScan= new Scanner(System.in);
		int F= Integer.parseInt(myScan.nextLine());
		// enter the amount of blocks
		String A="Src";
		String B="Aux";
		String C="Dst";
		Solve(F,A,B,C);
		
	}
}
