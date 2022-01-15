package Dp;
import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
	 
	  
	  int minr=0;
	  int maxr=arr.length-1;
	  int minc=0;
      int maxc=arr[0].length-1;
      int tne=n*m;
      int count=0;
	  
	  while(count<=n*m) {
		  // left wall
	  for(int i=minr;i<=maxr&& count<tne;i++)
	  { System.out.println(arr[i][minc]);
		  count++;
	  }
	  minc++;
	  // bottom walll
	  for(int i=minc;i<=maxc&& count<tne;i++)
	  {
		  System.out.println(arr[maxr][i]);
		  count++;
	  }
      maxr--;
      // right wall
     for(int i=maxr;i>=minr && count<tne;i--)
     {
    	 System.out.println(arr[i][maxc]);
    	 count++;
     }
     
     maxc--;
     // top  wall
     for(int i=maxc;i>=minc && count<tne;i--)
     {
    	 System.out.println(arr[minr][i]);
    	 count++;
     }
     minr++;
	  }
	}

}
