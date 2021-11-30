package arrays;
import java.util.*;

public class SortArray_0_1_2s {



	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int c1=0;
	int c2=0;
	int c3=0;
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=scan.nextInt();
	
	for(int j=0;j<n;j++)
	{
		if(arr[j]==0)
		  c1++;
		if(arr[j]==1)
			  c2++;
		
		if(arr[j]==2)
			  c3++;
			
	}
  int m=0;
	for(int s=0;s<c1;s++)
		arr[m++]=0;
	for(int s=0;s<c2;s++)
		arr[m++]=1;
	for(int s=0;s<c3;s++)
		arr[m++]=2;
		
for(int i=0;i<n;i++)
	System.out.print(arr[i]+" ");
		

	}

}
