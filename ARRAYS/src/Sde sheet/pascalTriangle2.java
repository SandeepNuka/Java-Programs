package StriversSdeSheet;

import java.util.List;
import java.util.ArrayList;

public class pascalTriangle2 {
	public static void main(String args[]) {
		List<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>(); 
		ArrayList<Integer> row=null;
		ArrayList<Integer> pre=null;
		int n=5;
		for(int i=0;i<n;i++) {
			row=new ArrayList<Integer>();
			for(int j=0;j<=i;j++) 
				if(j==0 || j==i) 
					row.add(1);
				else 
					row.add(pre.get(j-1)+pre.get(j));// we are adding the previous result

				pre=row;//in pre we are storing the previous result
				res.add(row);	
		}
		System.out.print("the pascal Triangle is"+res);
	}

}




/*
output
the pascal Triangle is[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]

*/