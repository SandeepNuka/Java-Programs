package Sringsimp;
import java.util.Scanner;

public class String2isRorationOfString1 {
	// s2 is rotaiton of s1 or not 
	// deepsan is rotation of sandeep or not answer is yes
	  public static void main (String[]args)
	  {
	    Scanner s = new Scanner (System.in);
	    String s1 = s.nextLine ();
	    String s2 = s.nextLine ();
	    String temp = s1 + s1;
	    if (temp.contains (s2))
	        System.out.println (" string s2 is rotation of string s1");
	    else
	        System.out.println ("tring s2 is not rotation of string s1");

	  }
	}


