package StriversSdeSheet;

public class SetmatrixZeros1 {

	public static void main(String[] args) {
	int matrix[][]= {{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,0,0,1}};
	setZeroToTheMatrix(matrix,4,4);
	for(int i=0;i<4;i++) {
		for(int j=0;j<4;j++) {
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println();
	}
			
	/*
	{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,0,0,1}
	 */
		
	
	
	

	}
	public static void setZeroToTheMatrix(int[][] matrix,int row,int col) {
		int column=0;
		
			  
		 for(int i=0;i<row;i++) {
			 if(matrix[i][0]==0) 
				 column=1;
			 for(int j=1;j<col;j++) 
				 if(matrix[i][j]==0) 
					 matrix[i][0]=matrix[0][j]=0;
		 }
					 
		for(int i=matrix.length-1;i>=0;i--)
			for(int j=matrix[0].length-1;j>=0;j--)
				if(matrix[i][0]==0 || matrix[0][j]==0) 
					matrix[i][j]=0;
				
		if(column==1)
			matrix[0][0]=0;
		 

	}	

}




/*
input
{0,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}
output
0 0 0 0 
0 1 1 1 
0 1 1 1 
0 1 1 1 



{0,1,2,0},{3,4,5,2},{1,3,1,5}input	
output
0 0 0 0 
0 4 5 0 
0 3 1 0 



{1,1,1},{1,0,1},{1,1,1}

1 0 1 
0 0 0 
1 0 1 

{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,0,0,1}

0 0 0 1 
0 0 0 0 
0 0 0 0 
0 0 0 0 

*/
