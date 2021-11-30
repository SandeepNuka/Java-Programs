package Strings;
import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s1="San deep";
		String s2="a  Spd   eEn";
		
		s1=s1.replace(" ", ""); //it will remove all spaces and make it as Sandeep
		s2=s2.replace(" ", "");// it will remove all spaces and make it as aSpdeEn
		s1=s1.toLowerCase(); // it will convert to lower case as sandeep
		s2=s2.toLowerCase();// it will convert to lower case as aspdeen
		
		char a[]=s1.toCharArray();// it will convert to character array
		char b[]=s2.toCharArray();// it will convert to character array
		Arrays.sort(a);// it will sort so adeenps
		Arrays.sort(b);// it will sort so adeenps
		if(Arrays.equals(a,b))// compare both the arrays
		{ 
		System.out.println("Strings are anargrams");
		}
		else
		{
	     System.out.println("Strings are not anargrams");
		}

	}

}
