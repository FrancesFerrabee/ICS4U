package ferrabee;

public class Sort {

	
	public static int[] insertionSort (int[] a )
	{
		for( int i=0; i<a.length; i++)
		{
			
				for( int j=1; j< i; j++)
				{
					if ( a[i]< a[j])
					{
						swap(a,i,j);
					
					}
				}
		}
			

		
		return a;
	
	}
	public static double[] insertionSort(double[]a)
	{
	
		for( int i=0; i<a.length; i++)
		{
			
				for( int j=1; j< i; j++)
				{
					if ( a[i]< a[j])
					{
						swap(a,i,j);
					
					}
				}
		}
			

		
		return a;
	
	}


	public static int[] selectionSort (int[] a )
	{
		for(int i= 0; i<a.length; i++)
		{
		
				for( int j=i+1; j<a.length; j++)
				{
					if ( a[i]> a[j])
					{	
						swap(a, i, j);
					}
				}
			}
		
		return a;
	
		
	}
	
	public static double[] selectionSort (double[] a )
	{
		for(int i= 0; i<a.length; i++)
		{
		
				for( int j=i+1; j<a.length; j++)
				{
					if ( a[i]> a[j])
					{	
						swap(a, i, j);
					}
				}
			}
		
		return a;
	
		
	}
	
	private static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private static void swap(double[] a, int i, int j){
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}




