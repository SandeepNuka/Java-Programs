package arrays;
import java.util.*;

public class NegativePositiveOneSide {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=scan.nextInt();
	int i=-1;
	int pivot=0;
	for(int j=0;j<n;j++) {
		if(arr[j]<pivot)
		{ i++;
		  int temp=arr[j];
		  arr[j]=arr[i];
		  arr[i]=temp;
			
		}
	}
		
	for(int j=0;j<n;j++)
	{
		System.out.print(arr[j]+" ");
	}
		
		


	}

}
