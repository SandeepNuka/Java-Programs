package DynamicProgramming;

public class laddersProb {

	public static void main(String[] args) {
		int n=5;// this is the maximum size of the ladder;
		int k=3 ;// he can chosee 1 or 2 or 3 steps 
		int dp[]=new int[n+1];
		for(int i=0;i<=n;i++)
			dp[i]=0;
		//System.out.println(ladderTotalSteps(n,k,dp));
		System.out.println(laddrTotalStepsBu(n,k));
	}
public static int ladderTotalSteps(int n,int k,int dp[]) {// top down appreach
	int ways=0;
	if(n==0)
		return 1;
	if(dp[n]!=0)
		return dp[n];
	for(int i=1;i<=3;i++)
		 if(n-i>=0)
			 ways=ways+ladderTotalSteps(n-i,k,dp);
			
	return dp[n]=ways;
}
public static int laddrTotalStepsBu(int n,int k) { //
	int dp1[]=new int[n+1];
	  dp1[0]=1;
	  int  ans=0;
	  for(int i=1;i<=n;i++) {
		  ans=0;
		  for(int j=1;j<=k;j++) { // using this loop we can add last three elements of the dp to ans
			  if(i-j>=0)
				  ans=ans+dp1[i-j];
		                        }
	  dp1[i]=ans;
	  }
	  return dp1[n];
}





}

