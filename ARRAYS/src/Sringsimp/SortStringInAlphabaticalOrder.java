package Sringsimp;
import java.util.Arrays;
import java.util.Scanner;

public class SortStringInAlphabaticalOrder {

	public static void main(String[] args) {
		Scanner s=new  Scanner(System.in);
		String sr=s.nextLine();
		char chararray[]=sr.toCharArray();
		
		//for(int i=0;i<sr.length();i++)// using this we can sort the string in alphabatical order
		//{
		 //for(int j=i+1;j<sr.length();j++)
		 //{
		   //if(chararray[i]>chararray[j])
		   //{
			 // char temp=chararray[i];
			  //chararray[i]=chararray[j];
			  //chararray[j]=temp;
		   //}
		 //}
			 
		//}
	
		 //System.out.println(new String(chararray));
		Arrays.sort(chararray);// using sort methos we can sort the alphabates
		System.out.println(new String(chararray));
	}

}
