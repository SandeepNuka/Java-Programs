package DynamicProgramming;

public class Wines {

	public static void main(String[] args) {
		int arr[]= {2,4,6,2,5};
		int dp[][]=new int[6][6];
		for(int i=0;i<6;i++)
			for(int j=0;j<6;j++)
				dp[i][j]=0;
		System.out.println(profit(0,arr.length-1,arr,1,dp));

	}
public static int profit(int i,int j,int[] arr,int y,int dp[][]) {// top down

	if(i>j)
		return 0;
	if(dp[i][j]!=0)
		return dp[i][j];
	int op1=arr[i]*y+profit(i+1,j,arr,y+1,dp);
	int op2=arr[j]*y+profit(i,j-1,arr,y+1,dp);
	return dp[i][j]=Math.max(op1,op2);
	
}
}
