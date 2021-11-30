package Sringsimp;
import  java.util.Scanner;

public class MaximumStringMinString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sr=s.nextLine();
		String str[]=sr.split(" ");
		int k=0;
		String max="";
		String min="";
		for(String c:str)
		{ if(k==0)
		{ max=c;
		     min=c;
		     k++;
		}
		 if(c.length()>max.length())
			  max=c;
		 if(c.length()<min.length())
			 min=c;
		}
System.out.println("maxlengthString  :"+max);
System.out.println(" minimumlengthString "+min);
	}
}
