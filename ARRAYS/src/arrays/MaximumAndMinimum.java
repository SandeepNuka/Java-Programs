package arrays;

public class MaximumAndMinimum {
	
	void max_and_min(int a[],int n)
	{ int max=Integer.MIN_VALUE;            /* it will take 0(n) time complexity */
	  int min =Integer.MAX_VALUE;
		if(n%2==1)                   
		{
			max=min=a[0];
		}
		else
		{
			int i=0,j=1;
			
			while(j<n)
			{
				if(a[i]>a[j])
					if(a[i]>max)
						max=a[i];
			
				if(a[i]<a[j])
					if(a[i]<min)
						min=a[i];
				
				i++;
				j++;
			}
		
		  System.out.println("minimumvlaue"+" " +min);

		   System.out.println("maximumvlaue"+" "  +max);
		}
		
		
	}

	public static void main(String[] args) {
	   
	int arr[]= {9,7,44,76,90,23,567,90,45,333};
	MaximumAndMinimum obj=new MaximumAndMinimum();
	obj.max_and_min(arr,arr.length);
	

	}

}
