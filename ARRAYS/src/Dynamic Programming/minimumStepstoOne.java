package DynamicProgramming;



// operations are n=>n/3 
// n=>n/2
// n=>n-1

public class minimumStepstoOne {

	public static void main(String[] args) {
	int n=10;
	int dp[]=new int[n+1];
	for(int i=0;i<n;i++)
	dp[i]=0;
	//System.out.println(minStepsTd(n,dp));
	System.out.println(minStepsBu(n));
	

	}
 
 public static int  minStepsTd(int n,int dp[])
 { 
int op1=Integer.MAX_VALUE;
   int op2=Integer.MAX_VALUE;
   int op3=Integer.MAX_VALUE;
	 if(n==1)
	 return 0;
   if(dp[n]!=0)
     return dp[n];
   if(n%3==0)
	     op1=minStepsTd(n/3,dp)+1;
   if(n%2==0)
	   op2=minStepsTd(n/2,dp)+1;
   
	op3=minStepsTd(n-1,dp)+1;
   
   return dp[n]= Math.min(Math.min(op1,op2),op3);

 }
 
 public static int minStepsBu(int n)
 {  int dp[]=new int [n+1];
	dp[0]=0;
	dp[1]=0;
	if(dp[n]!=0)
		return dp[n];
	for(int i=2;i<=n;i++)
	{ int op1,op2,op3;
	      op1=op2=op3=Integer.MAX_VALUE;
		if(i%3==0)
		 op1=dp[i/3]+1;
	   if(i%2==0)
		op2=dp[i/2]+1;
	   
	  op3=dp[i-1]+1;
	  dp[i]=Math.min(Math.min(op1, op2),op3);
	}
return dp[n]; 
 }
 
}
