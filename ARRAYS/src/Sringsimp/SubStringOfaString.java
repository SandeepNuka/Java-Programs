package Sringsimp;
import java.util.*;

public class SubStringOfaString {
	// substrings of the String  a ab abc abcd b bc bcd cd d

	  public static void main (String[]args)
	  {
	    String s = "abcd";
	    for (int i = 0; i < s.length (); i++)
	      for (int j = i + 1; j <= s.length (); j++)
		  System.out.println (s.substring (i, j));
	      
	  }
	}


