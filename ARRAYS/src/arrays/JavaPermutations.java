package arrays;
import java.util.Scanner;
import java.io.*;

public class JavaPermutations {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		String str=sn.next();
		printPermutations(str,"");
		
	}
	public static void printPermutations(String ques,String ash)
	{
		if(ques.length()==0)
		{
			System.out.println(ash);
			return;
		}
		for(int i=0;i<ques.length();i++)
		{   char ch=ques.charAt(i);
		String qlpart=ques.substring(0,i);
		String qrpart=ques.substring(i+1);
		String combine=qlpart+qrpart;
		printPermutations(combine,ash+ch);
			
		}
	}

}
