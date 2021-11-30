package Sringsimp;
import java.util.Scanner;
import java.util.ArrayList;
// example s1="india is great" s2="in" output="da s great"

public class RemoveCharacherFromFirstStringPresentInSecondString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Character> c2=new ArrayList<>();
		String s1=s.nextLine();
		String s2=s.nextLine();
		for(int i=0;i<s2.length();i++)
		{  c2.add(s2.charAt(i));
			
		}
		String str[]=s1.split(" ");
		 String output="";
		 for(String strr:str)
		 { String mid="";
		   for(int j=0;j<strr.length();j++)
		   {  if(!c2.contains(strr.charAt(j)))
			      mid=mid+strr.charAt(j);
		   }
			output=output+mid+" "; 
		 }
		System.out.println(output);

	}

}
