package ferrabee;

public class Sort {

	
	public static int[] insertionSort( int [ ] a)
	{
int num;
int i;


for (int j = 1; j < a.length; j++) {
	// creates a loop for index's of array a
	
num = a[ j ];


for(i = j - 1; (i >= 0) && (a[ i ] <num); i--)
	// creates a loop for the value of a at index i to be less then a at index j without equaling 0.
 {
 a[ i+1 ] = a[ i ];
 // changes a at index i + 1 to index i.
}
a[ i+1 ] =num;
// changes a at index i+1 to the old value of a at index i
 }
	return a;
	// returns sorted array
	}


	public static double[] insertionSort( double[ ] a)
	{
double num;
int i;

for (int j = 1; j < a.length; j++) {
	// creates a loop for index's of array a
 num = a[ j ];
for(i = j - 1; (i >= 0) && (a[ i ] <num); i--)
	// creates a loop for the value of a at index i to be less then a at index j without equaling 0.
 {
 a[ i+1 ] = a[ i ];
 // changes a at index i + 1 to index i.
}
a[ i+1 ] = num;
//changes a at index i+1 to the old value of a at index i
 }
	return a;
	// returns sorted array
	}
	
	public static int[] selectionSort (int[] a )
	{
		for(int i= 0; i<a.length; i++)
		{
			// creates a loop for index's of array a
		
				for( int j=i+1; j<a.length; j++)
				{
					// This array sees if any value of a at index i is greater then another value of a at index j
					if ( a[i]> a[j])
					{	
						swap(a, i, j);
						// if a at index i is greater then a at index j the 2 values switch at the swap method is called
					}
				}
			}
		
		return a;
		// returns the sorted array
	
		
	}
	public static double[] selectionSort (double[] a )
	{
		for(int i= 0; i<a.length; i++)
		{
			// creates a loop for index's of array a
		
				for( int j=i+1; j<a.length; j++)
				{
					// This array sees if any value of a at index i is greater then another value of a at index j
					if ( a[i]> a[j])
					{	
						swap(a, i, j);
						// if a at index i is greater then a at index j the 2 values switch at the swap method is called
					}
				}
			}
		
		return a;
	// returns the sorted array
		
	}
	
	private static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		// swaps the value of a at index i with the value of a at index j. 
	}
	private static void swap(double[] a, int i, int j){
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		// swaps the value of a at index i with the value of a at index j. 
	}
	
}




