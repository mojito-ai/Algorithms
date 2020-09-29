package algorithms;
public class SelectionSort  {
	
	public static void sort(Comparable [] a)
	{
		int N=a.length;
		for (int i=0;i<N;i++)
		{
			int min=i;
			for(int j=i;j<N;j++)
				if(less(a[j],a[min]))
					min=j;
			exch(a,i,min);
		}
	}
	
	private static boolean less(Comparable v, Comparable w)
	{	return v.compareTo(w)<0;	}
	
	private static void exch(Comparable [] a, int i, int j)
	{
		Comparable swap= a[i];
		a[i]=a[j];
		a[j]=swap;
	}

	public static void main(String[] args) {
		Comparable arr[]= {3,5,1,5,2,5,2,6,8,3,3232,333,45,6,1};
		SelectionSort.sort(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}
}
