package ferrabee;

public class Sort {


	public static String[] quickSort(String []a)
	{	
		int i=0;
		int j=a.length-1;
		quickSort(a, i, j);
		// sends the value of i which is at the far left of the array and j which is to the far right of the array 
		return a;
		// returns the sorted array.

	}

	private static void quickSort(String a[], int i, int j)
	{

		int num = partition(a, i, j);
		// calls the method partition

		if (i< num - 1)
		{
			quickSort(a, i, num - 1);
			// calls the method again, but replaces the j value with the num subtract one.
		}
		if (num < j)
		{
			quickSort(a, num,j);
			// calls the method again, but replaces the i value with num.
		}

	}

	private static int partition (String a[], int i, int j)
	{

		int  mid= (i+j)/2;
		String pivot = a[mid];
		// creates a pivot number

		while (i <= j) 
		{

			while (a[i] .compareTo(pivot)< 0)
			{
				i++;
				// the i value makes sure everything to the left of it is smaller then the pivot
			}
			while (a[j].compareTo(pivot)>0)
			{
				j= j-1;
				// the j value makes sure everything to the right of it is larger then the pivot
			}
			if (i <= j) 
			{
				swap(a, i,j);
				// swaps a at value i with a at value j
				i++;
				j= j-1;
			}
		}

		return i;
		// if i is greater then j then return the value of i.
		// this will be the point at which everything to the left of i is less then the pivot and everything to the right of i is greater then the pivot.

	}

	public static double[] quickSort(double []a)
	{	
		int i=0;
		int j=a.length-1;
		quickSort(a, i, j);
		// sends the value of i which is at the far left of the array and j which is to the far right of the array 
		return a;
		// returns the sorted array.

	}

	private static void quickSort(double a[], int i, int j)
	{

		int num = partition(a, i, j);
		// calls the method partition

		if (i< num - 1)
		{
			quickSort(a, i, num - 1);
			// calls the method again, but replaces the j value with the num subtract one.
		}
		if (num < j)
		{
			quickSort(a, num,j);
			// calls the method again, but replaces the i value with num.
		}

	}

	private static int partition (double a[], int i, int j)
	{

		int  mid= (i+j)/2;
		double pivot = a[mid];
		// creates a pivot number

		while (i <= j) 
		{

			while (a[i] < pivot)
			{
				i++;
				// the i value makes sure everything to the left of it is smaller then the pivot
			}
			while (a[j] > pivot)
			{
				j= j-1;
				// the j value makes sure everything to the right of it is larger then the pivot
			}
			if (i <= j) 
			{
				swap(a, i,j);
				// swaps a at value i with a at value j
				i++;
				j= j-1;
			}
		}

		return i;
		// if i is greater then j then return the value of i.
		// this will be the point at which everything to the left of i is less then the pivot and everything to the right of i is greater then the pivot.

	}

	public static int[] quickSort(int []a)
	{	
		int i=0;
		int j=a.length-1;
		quickSort(a, i, j);
		// sends the value of i which is at the far left of the array and j which is to the far right of the array 
		return a;
		// returns the sorted array.

	}

	private static void quickSort(int a[], int i, int j)
	{

		int num = partition(a, i, j);
		// calls the method partition

		if (i< num - 1)
		{
			quickSort(a, i, num - 1);
			// calls the method again, but replaces the j value with the num subtract one.
		}
		if (num < j)
		{
			quickSort(a, num,j);
			// calls the method again, but replaces the i value with num.
		}

	}

	private static int partition (int a[], int i, int j)
	{

		int  mid= (i+j)/2;
		int pivot = a[mid];
		// creates a pivot number

		while (i <= j) 
		{

			while (a[i] < pivot)
			{
				i++;
				// the i value makes sure everything to the left of it is smaller then the pivot
			}
			while (a[j] > pivot)
			{
				j= j-1;
				// the j value makes sure everything to the right of it is larger then the pivot
			}
			if (i <= j) 
			{
				swap(a, i,j);
				// swaps a at value i with a at value j
				i++;
				j= j-1;
			}
		}

		return i;
		// if i is greater then j then return the value of i.
		// this will be the point at which everything to the left of i is less then the pivot and everything to the right of i is greater then the pivot.

	}

	private static void mergeSort(String a[], int start, int end)
	{
		if(start<end)
		{
			int mid = (end + start) / 2;
			mergeSort(a, start, mid);
			// get left half of the array

			mergeSort(a, mid+1, end);
			// get right half of the array
			merge(a, start, mid, end);
			// calls method merge which merges left and right side of the array
		}
	}

	public static String[] mergeSort(String []a)
	{
		int start = 0;
		int end = a.length-1;
		mergeSort(a, start, end);
		// calls mergeSort.
		return a;
	}


	private static void merge(String[] array,int start, int mid, int end )
	{
		String [] c = new String[array.length];
		for (int i = 0; i < array.length; i++)
		{
			c[i] = array[i];
		}
		//duplicates the array "array" into array "c".
		int count = start;
		int num = mid+1;
		int i = start;
		while (count <= mid && num <= end)
		{
			if (c[count].compareTo(c[num])<=0) 
			{
				array[i] =c[count];
				count++;
				// makes the value of count go up when c at count is less than or equal to c at num.
			} 
			else
			{
				array[i] = c[num];
				num++;
				// makes the value of num go up when c at count is greater then c at num.
			}
			i++;
			// every time it goes through the while loop the value of i goes up by 1.
		}
		while (count <= mid) 
		{
			array[i] = c[count];
			i++;
			count++;
			// the value of both i and count will go up by one while the value of count is less then or equal to mid.
		}
		while(num <= end)
		{
			array[i] = c[num];
			i++;
			num++;
			// the value of both i and num will go up by one while the value of num is less then or equal to end.
		}
	}

	private static void mergeSort(int a[], int start, int end)
	{
		if(start<end)
		{
			int mid = (end + start) / 2;
			mergeSort(a, start, mid);
			// get left half of the array

			mergeSort(a, mid+1, end);
			// get right half of the array
			merge(a, start, mid, end);
			// calls method merge which merges left and right side of the array
		}
	}

	public static int[] mergeSort(int []a)
	{
		int start = 0;
		int end = a.length-1;
		mergeSort(a, start, end);
		// calls mergeSort.
		return a;
	}


	private static void merge(int[] array,int start, int mid, int end )
	{
		int [] c = new int[array.length];
		for (int i = 0; i < array.length; i++)
		{
			c[i] = array[i];
		}
		//duplicates the array "array" into array "c".
		int count = start;
		int num = mid+1;
		int i = start;
		while (count <= mid && num <= end)
		{
			if (c[count] <= c[num]) 
			{
				array[i] =c[count];
				count++;
				// makes the value of count go up when c at count is less than or equal to c at num.
			} 
			else
			{
				array[i] = c[num];
				num++;
				// makes the value of num go up when c at count is greater then c at num.
			}
			i++;
			// every time it goes through the while loop the value of i goes up by 1.
		}
		while (count <= mid)
		{
			array[i] = c[count];
			i++;
			count++;
			// the value of both i and count will go up by one while the value of count is less then or equal to mid.
		}
		while(num <= end)
		{
			array[i] = c[num];
			i++;
			num++;
			// the value of both i and num will go up by one while the value of num is less then or equal to end.
		}
	}

	private static void mergeSort(double a[], int start, int end)
	{
		if(start<end)
		{
			int mid = (end + start) / 2;
			mergeSort(a, start, mid);
			// get left half of the array

			mergeSort(a, mid+1, end);
			// get right half of the array
			merge(a, start, mid, end);
			// calls method merge which merges left and right side of the array
		}
	}
	
	public static double[] mergeSort(double []a)
	{
		int start = 0;
		int end = a.length-1;
		mergeSort(a, start, end);
		// calls mergeSort.
		return a;
	}

	private static void merge(double[] array,int start, int mid, int end )
	{
		double [] c = new double[array.length];
		for (int i = 0; i < array.length; i++)
		{
			c[i] = array[i];
		}
		//duplicates the array "array" into array "c".
		int count = start;
		int num = mid+1;
		int i = start;
		while (count <= mid && num <= end)
		{
			if (c[count] <= c[num]) 
			{
				array[i] =c[count];
				count++;
				// makes the value of count go up when c at count is less than or equal to c at num.
			} 
			else
			{
				array[i] = c[num];
				num++;
				// makes the value of num go up when c at count is greater then c at num.
			}
			i++;
			// every time it goes through the while loop the value of i goes up by 1.
		}
		while (count <= mid) 
		{
			array[i] = c[count];
			i++;
			count++;
			// the value of both i and count will go up by one while the value of count is less then or equal to mid.
		}
		while(num <= end)
		{
			array[i] = c[num];
			i++;
			num++;
			// the value of both i and num will go up by one while the value of num is less then or equal to end.
		}
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


		for (int j = 1; j < a.length; j++) 
		{
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


		for (int j = 1; j < a.length; j++) 
		{
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

		for (int j = 1; j < a.length; j++) 
		{
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

	private static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		// swaps the value of a at index i with the value of a at index j. 
	}
	private static void swap(double[] a, int i, int j)
	{
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		// swaps the value of a at index i with the value of a at index j. 
	}
	private static void swap(String[] a, int i, int j)
	{
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		// swaps the value of a at index i with the value of a at index j. 
	}

}






