package binarytree;
import java.util.*;

public class array {
	public static void main(String as[])
	{  
		Scanner s= new Scanner(System.in);
		String sr=s.nextLine();
		char[]  as1 = sr.toCharArray();
		  int i,j;
		  i=0;
		  j=as1.length-1;
		  while(i<j)
		  {
			  char temp=as1[i];
			  as1[i]=as1[j];
			  as1[j]=temp;
			  i++;
			  j--;
			  
		  }
		    String ss=new String(as1);
		    System.out.println(ss);
		
	}
}


