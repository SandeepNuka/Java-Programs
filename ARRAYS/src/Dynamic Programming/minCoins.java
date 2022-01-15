package DynamicProgramming;

public class minCoins {

	public static void main(String[] args) {
		int n=15;
		int dp[]=new int[n+1];
		for(int i=0;i<=n;i++)
			dp[i]=0;
		int arr[]= {1,7,10};
		int noOfCoins=arr.length;
		//System.out.println(minCoinTd(n,arr,dp,noOfCoins));
		System.out.println(minCoinBu(n,arr,noOfCoins));

	}
public static int minCoinTd(int n,int[] arr,int dp[],int noOfCoins)// top down approach
{ if(n==0)// if o coins are there then 0 coins are required
	return 0;
  if(dp[n]!=0)// we will alwasys store the intermediate result int dp
	  return dp[n];
  int ans=Integer.MAX_VALUE;
  for(int i=0;i<noOfCoins;i++)
   { if(n-arr[i]>=0)
       { int subprob=minCoinTd(n-arr[i],arr,dp,noOfCoins);
        ans=Math.min(ans, subprob+1); 
        }
      }
 dp[n]=ans;
 return dp[n];
}

public static int minCoinBu(int n ,int arr[],int noOfCoins) {// buttom up approach
	int dp[]=new int[n+1];
	    dp[0]=0;
	for(int i=1;i<=n;i++)
	{ int ans=Integer.MAX_VALUE;
	   for(int j=0;j<noOfCoins;j++)// this loop for no of coins
		   if(i-arr[j]>=0)
			   ans=Math.min(ans, dp[i-arr[j]]+1);
	dp[i]=ans;
	}
	return dp[n];
}




}
