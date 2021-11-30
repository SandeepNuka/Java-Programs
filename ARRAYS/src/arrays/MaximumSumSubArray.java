package arrays;
import java.util.*;

public class MaximumSumSubArray {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=scan.nextInt();
	int maximumSum=Integer.MIN_VALUE;
	int maximumSumTillHere=0;
	for(int i=0;i<n;i++)
	{ maximumSumTillHere=maximumSumTillHere+arr[i];
	  if(maximumSumTillHere>maximumSum)
		  maximumSum=maximumSumTillHere;
	  if(maximumSumTillHere<0)
		  maximumSumTillHere=0;
	}
	System.out.println("the maximum sum subarry is"+ maximumSum);

	}

}
