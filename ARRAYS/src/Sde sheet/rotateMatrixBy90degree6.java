package StriversSdeSheet;
/*
 if you want to rotate the matrix by 90 degrees 
 first you transpose the matrix
 then you reverse the matrix
 */

public class rotateMatrixBy90degree6 {

	public static void main(String[] args) {
	int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
	transpose(matrix);
	reverseMatrix(matrix);
	System.out.println("The rotated matrix is");
	for(int i=0;i<matrix.length;i++) {
		for(int j=0;j<matrix[0].length;j++) 
			System.out.print(matrix[i][j]+" ");
		
		System.out.println();
	}
	

	}
	public static void transpose(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) { // for transposing
			for(int j=i;j<matrix[0].length;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		
	}
	public static void reverseMatrix(int[][] matrix) {
		
		for(int i=0;i<matrix.length;i++) {  // for reversing
			for(int j=0;j<matrix[0].length/2;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[i][matrix[0].length-1-j];
				matrix[i][matrix[0].length-1-j]=temp;
			}
		}
		
	}
}
