package grid_Dynamic_Pogramming;
// we can only chosee from to or lest and we should go buttom or rigth

public class min_Cost {

	public static void main(String[] args) {
		int cost[][]= {{1,5,2},{7,1,1},{8,1,3}};
		int row=cost.length;
		int col=cost[0].length;
		System.out.println(min_costPath(cost,row,col));

	}
	public static int min_costPath(int cost[][],int row,int col)
	{int dp[][]=new int[row][col];
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
			 if(i==0 && j==0)
				 dp[i][j]=cost[i][j];
			 else if(i==0)
				   dp[i][j]=dp[0][j-1]+cost[0][j];
			 else if(j==0)
				   dp[i][j]=dp[i-1][0]+cost[i][0];
			 else
	    		  dp[i][j]=Math.min(dp[i][j-1],dp[i-1][j])+cost[i][j];
		
		
	    for(int i=0;i<row;i++) {
	    	for(int j=0;j<col;j++) {
	    		System.out.print(dp[i][j]+" ");
	    	}
	    System.out.println();
	    }
	return dp[row-1][col-1];
	}

}
