package DynamicProgramming;

public class knapSack {

	public static void main(String[] args) {
		
		int val[]= {10,15,40};
		int wt[]= {1,2,3};
		int w=6;
		int n=val.length;
		int dp[][]=new int[n+1][w+1];
		for(int i=0;i<=n;i++)
			for(int j=0;j<=w;j++)
			dp[i][j]=0;
		System.out.println(knapSackProfit(val,wt,w,n,dp));
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=w;j++) {
			System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}

	}
public static int  knapSackProfit(int  val[],int wt[],int w,int n,int dp[][])
{     
  if(dp[n][w]!=0)
	  return dp[n][w];
	if(w==0 || n==0)
		return 0;
	if(wt[n-1]>w)
		dp[n][w]=knapSackProfit(val,wt,w,n-1,dp);
	else
		dp[n][w]=Math.max((val[n-1])+knapSackProfit(val,wt,w-wt[n-1],n-1,dp),knapSackProfit(val,wt,w,n-1,dp));
	return dp[n][w];
}
}
