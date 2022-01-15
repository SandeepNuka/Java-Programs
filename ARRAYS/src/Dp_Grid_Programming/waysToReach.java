package grid_Dynamic_Pogramming;
// finding the number of ways to reach a particular position from a given staring point in 2d gried and 
// you are 
// 1)rat(Right & down 1 Step)
// every first row each cell has only one chance becase we cannot choose from top only choose from left
//every firsr col each cell has only one chance because we cannot choose from lect only choose from top 

public class waysToReach {

	public static void main(String[] args) {
	
		int dp[][]=new int[4][4];
		System.out.println(numberOfWaystoReachACell(dp,4,4));

	}
public static int numberOfWaystoReachACell(int dp[][],int row,int col) {
	for(int i=0;i<row;i++)
		for(int j=0;j<col;j++)
			if(i==0 || j==0)
				dp[i][j]=1;
	for(int i=0;i<row;i++)
		for(int j=0;j<col;j++)
			if(i!=0 && j!=0)
			dp[i][j]=dp[i][j-1]+dp[i-1][j];
	
	return dp[row-1][col-1];
}
}
