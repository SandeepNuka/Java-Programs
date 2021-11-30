package Sringsimp;
import java.util.*;
public class LongestSubString {
	// Longest substring without repeating charachers  
	
	  public static void main (String[]args)
	  {
	    String sr = "abcdabc";
	      System.out.println (LongestSubstring1 (sr));
	  }

	  public static String LongestSubstring1 (String s)
	  {
	    HashSet < Character > se = new HashSet <> ();
	    String LongestString = "";
	    String StringTillNow = "";
	    for (int i = 0; i < s.length (); i++)
	      {


		char c = s.charAt (i);
		if (se.contains (c))
		  {
		    StringTillNow = "";
		    se.clear ();
		  }
		StringTillNow += c;
		se.add (c);
		if (StringTillNow.length () > LongestString.length ())
		  {
		    LongestString = StringTillNow;
		  }
	      }
	    return LongestString;

	  }
	}// Longest substring without repeating charachers  
	

