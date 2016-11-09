package ferrabee;

public class searches {

	public static int binarySearch(int[]a, int target)
	{
		return binarySearch(a, target, 0, a.length);
		// Takes the values into the private class
	}
	private static int binarySearch(int[]a, int target, int start, int end)
	{
		int midIndex= (start+end)/2;
		// The midpoint between the end and start of the list
		if( start>end)
		{
			return (-1);
			// The midpoint between the end and start of the list
		}
		else
		{
			if (a[midIndex]==target)
				return ( midIndex+1);
			// returns the index value where the target is found
			else if(a[midIndex]>target)
			{
				return binarySearch(a, target,start,midIndex-1);
				// goes to the top of the method and turns end into the middle Index
			}
			else if( a[midIndex]< target)
			{
				return binarySearch( a, target,midIndex+1, end );
				// goes to the top of the method and turns start into the middle Index
			}
			else
			{

				return (-1);
			}	
		}
	}
	public static int linearSearch(int[]a, int target)
	{
		return linearSearch(a, target, 0, a.length);
	}
	private static int linearSearch(int[]a, int target, int start, int end)
	{
		// Takes the values into the private class
		for( int i=0; i<a.length; i++)
		{
			if( a[i]==(target))
			{
				// goes through the for loop until the value of a is equal to the target
				return (i+1);
				// returns the spot the target is found
				
			}
		}
		return -1;
		// if the target cannot be found -1 is outputed
	}



	public static int binarySearch(String[]a, String target)
	{
		return binarySearch(a, target, 0, a.length);
		// Takes the values into the private class
	}
	private static int binarySearch(String[]a, String target, int start, int end)
	{
		int midIndex= (start+end)/2;
		// The midpoint between the end and start of the list
		if( start>end)
		{
			return (-1);
			// The midpoint between the end and start of the list
		}
		else
		{
			if (a[midIndex].compareTo(target)==0)
				return ( midIndex+1);
			// returns the index value where the target is found
			else if(a[midIndex].compareTo(target)<0)
			{
				return binarySearch(a, target,start,midIndex-1);
				// goes to the top of the method and turns end into the middle Index
			}
			else if( a[midIndex].compareTo(target)>0)
			{
				return binarySearch( a, target,midIndex+1, end );
				// goes to the top of the method and turns start into the middle Index
			}
			else
			{

				return (-1);
			}	
		}
	}
	public static int linearSearch(String[]a, String target)
	{
		return linearSearch(a, target, 0, a.length);
		// Takes the values into the private class
	}
	private static int linearSearch(String[]a, String target, int start, int end)
	{
		for( int i=0; i<a.length; i++)
		{
			if( a[i].equals(target))
			{
				// goes through the for loop until the value of a is equal to the target
				return (i);
				// returns the spot the target is found
			}
		}
		return -1;
		// if the target cannot be found -1 is outputed
	}

	public static int binarySearch(double[]a, double target)
	{
		return binarySearch(a, target, 0, a.length);
		// Takes the values into the private class
	}
	private static int binarySearch(double []a, double target, int start, int end)
	{
		int midIndex= (start+end)/2;
		if( start>end)
		{
			return (-1);
			// The midpoint between the end and start of the list
		}
		else
		{
			if (a[midIndex]==target)
				return ( midIndex+1);
			// returns the index value where the target is found
			else if(a[midIndex]>target)
			{
				return binarySearch(a, target,start,midIndex-1);
				// goes to the top of the method and turns end into the middle Index
			}
			else if( a[midIndex]< target)
			{
				return binarySearch( a, target,midIndex+1, end );
				// goes to the top of the method and turns end into the middle Index
			}
			else
			{

				return (-1);
			}	
		}
	}
	public static int linearSearch(double[]a, double target)
	{
		return linearSearch(a, target, 0, a.length);
	}
	private static int linearSearch(double[]a, double target, int start, int end)
	{
		for( int i=0; i<a.length; i++)
		{
			// goes through the for loop until the value of a is equal to the target
			if( a[i]==(target))
			{
				return (i+1);
				// returns the spot the target is found
			}
		}
		return -1;
		// if the target cannot be found -1 is outputed
	}



}
