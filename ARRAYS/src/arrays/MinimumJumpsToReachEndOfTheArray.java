package arrays;
import java.util.*;

public class MinimumJumpsToReachEndOfTheArray {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=scan.nextInt();
	int dp[]=new int[n];
	for(int i=0;i<n;i++) dp[i]=Integer.MAX_VALUE;
	
	 dp[0]=0;
	 
	 for(int i=1;i<n;i++)
		 for(int j=0;j<i;j++)
			 if(dp[j]!=Integer.MAX_VALUE&&i<=j+arr[j]) 
				 if(dp[j]+1<dp[i])
					 dp[i]=dp[j]+1;
				 
			 
	if(dp[n-1]!=Integer.MAX_VALUE)
		System.out.println("minimum number of jumps is"+" "+dp[n-1]);
	else
		System.out.println(-1);
		

	}

}
