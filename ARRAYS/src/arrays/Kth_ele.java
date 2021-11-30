package arrays;
public class Kth_ele {
	static void merge(int ar[],int l,int m,int h) {
		int i=l;
		int k=l;
		int j=m+1;
		int B[]=new int[100];
		
		while(i<=m && j<=h)
		{
			if(ar[i]<ar[j])
				B[k++]=ar[i++];
			else
			B[k++]=ar[j++];
			
		}
		
		for(;i<=m;i++)
			B[k++]=ar[i];
		for(;j<=h;j++)
			B[k++]=ar[j];
		for(i=l;i<=h;i++)
			ar[i]=B[i];
		
		
		
	}
	
static	void mergesort(int ar[],int l,int h)
	{int mid;
		while(l<h)
		{
			mid=(l+h)/2;
			mergesort(ar,l,mid);
			mergesort(ar,mid+1,h);
			merge(ar,l,mid,h);
			
		
			
		}
		
	}

static void print(int ar[],int n)   
	{
		for(int k=0;k<n;k++)
			System.out.print(ar[k]+" ");
	}


	public static void main(String[] args) {
		
		int arr[]= { 9,8,34,56,98,23,76,78,34};
		
	
		mergesort(arr, 0, arr.length-1);
	
         print(arr, arr.length);
	}

}
