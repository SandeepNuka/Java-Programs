package Sringsimp;
import java.util.*;

public class StirngWellFormedOrNotUsingStack {
	  public static void main (String[]args)
	  {
	    String s = "{[()]}";	//this is the string 
	      Stack < Character > st = new Stack <> ();
	    for (int i = 0; i < s.length (); i++)
	      {
		if (st.empty ())
		  st.push (s.charAt (i));

		else if (s.charAt (i) == ']' && st.peek () == '[')	// using peek we can get the peek element of the stack
		  st.pop ();
		else if (s.charAt (i) == ')' && st.peek () == '(')
		  st.pop ();
		else if (s.charAt (i) == '}' && st.peek () == '{')
		  st.pop ();
	      }
	    if (st.empty ())		// if there is no symbol in the stack then we should understand that string is well formed
	        System.out.println ("string is well formed");
	    else
	      System.out.println ("String is not formed");



	  }
	}


