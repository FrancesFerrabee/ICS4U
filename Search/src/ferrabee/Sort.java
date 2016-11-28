package ferrabee;

public class Sort {

	
    private int[] numbers;
    private int[] helper;


	public static void mergeSort(int array[], int start, int end)
	{
		if( array.length==0){
			return;
		}
		int a= array.length/2;
		int [] c= new int[a];
			for( int i=start; i<end; i++)
			{
				c[i]= array[i];
			}
		mergeSort(c, start, a);
		
		int b=array.length/2;
		mergeSort(rightHalf);
		
		merge(lefthalf, righthalf);
		
	}
public static int caller(int []a)
{
	int start= 0;
	int end= a.length;
	mergeSort(a, start, end);
}


	public static int[] bubbleSort( int [ ]a )
	{
	     int j;
	   
	   

	    for(int c = 0; c < a.length - 1; c++)
	     {
	    	 // keeps looping until end is true
	        
	            for( j=0;  j < a.length -1;  j++ )
	            {
	            // creates a loop for index's of array a
	            	int i= j+1;
	            	
	                  if ( a[ j ] > a[i] )  
	                   {
	            
	                           swap(a, i, j);
	                       
	                          //while the value of a at index j is greater then the value of a at index i 
	                          //the values of a at index i and a at index j swap.
	                          
	                  } 
	            } 
	      }
	     return a;
	     // returns the sorted array a.
	} 
	
	public static double[] bubbleSort(double  [ ]a )
	{
	     int j;
	   
	   

	    for(int c = 0; c < a.length - 1; c++)
	     {
	    	 // keeps looping until end is true
	        
	            for( j=0;  j < a.length -1;  j++ )
	            {
	            // creates a loop for index's of array a
	            	int i= j+1;
	            	
	                  if ( a[ j ] > a[i] )  
	                   {
	            
	                           swap(a, i, j);
	                       
	                          //while the value of a at index j is greater then the value of a at index i 
	                          //the values of a at index i and a at index j swap.
	                          
	                  } 
	            } 
	      }
	     return a;
	     // returns the sorted array a.
	} 
	
	
	public static String[] bubbleSort( String [ ]a )
	{
	     int j;
	   
	   

	    for(int c = 0; c < a.length - 1; c++)
	     {
	    	 // keeps looping until end is true
	        
	            for( j=0;  j < a.length -1;  j++ )
	            {
	            // creates a loop for index's of array a
	            	int i= j+1;
	            	
	                  if ( a[ j ].compareTo( a[i])>0)  
	                   {
	            
	                           swap(a, i, j);
	                       
	                          //while the value of a at index j is greater then the value of a at index i 
	                          //the values of a at index i and a at index j swap.
	                          
	                  } 
	            } 
	      }
	     return a;
	     // returns the sorted array a.
	} 
	
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


	public static String[] insertionSort(String []a)
	{
		String num;
		int i;


		for (int j = 1; j < a.length; j++) {
			// creates a loop for index's of array a
			
		num = a[ j ];


		for(i = j - 1; (i >= 0) && (a[ i ].compareTo(num)<0); i--)
			// creates a loop for the value of a at index i to be less then a at index j without equaling 0.
		 {
		 a[ i+1 ] = a[ i ];
		 // changes a at index i + 1 to index i.
		}
		a[ i+1 ] = num;
		// changes a at index i+1 to the old value of a at index i
	}
		return a;
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
	public static String[] selectionSort (String[] a )
	{
		for(int i= 0; i<a.length; i++)
		{
			// creates a loop for index's of array a
		
				for( int j=i+1; j<a.length; j++)
				{
					// This array sees if any value of a at index i is greater then another value of a at index j
					if ( a[i].compareTo( a[j])>0)
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
	private static void swap(String[] a, int i, int j){
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		// swaps the value of a at index i with the value of a at index j. 
	}
	
}






