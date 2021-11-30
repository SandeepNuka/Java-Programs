package arrays;

public class ArrayReverse {
	
	static void reverse(int a[],int n)
	{
		int i,j;
		i=0;
		j=n-1;
		while(i<j)
		{
	    int temp;
	    temp=a[i];
	    a[i]=a[j];
	    a[j]=temp;
	    i++;
	    j--;
			
		}
		
	}
	
	static void print(int ar[],int n)    /*  this program will take o(n) time  */
	{
		for(int k=0;k<n;k++)
			System.out.print(ar[k]+" ");
	}

	public static void main(String[] args) {
		
		int arr[]= {9,8,7,6,5,4,3,2,1};
		reverse(arr,arr.length);
		print(arr,arr.length);

	}
	

}
