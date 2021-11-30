package Strings;
import java.util.HashMap;

public class FirstNonRepeatingCharInString {

	public static void main(String[] args) {
	   String str="prepinsta";
	   HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
	   int strlen=str.length();
	   for(int i=0;i<strlen;i++)
	   {
		 Character currentchar=str.charAt(i); // taking first character from string
		 if(hmap.containsKey(currentchar)==false) // checking the taken character present in hashmap or not
		 {  hmap.put(currentchar, 1); // if the character is not present we are inserting character with frquecy with 1
		 }
		 else
		 {
		   int frequency=hmap.get(currentchar); // here we are taking the frequency of character and incresing with 1
		    frequency=frequency+1;
		    hmap.put(currentchar,frequency); // again inserting
		 }
	   }
	  boolean bol=false;
	   for(int i=0;i<strlen;i++)
	   {
		   Character currentchar=str.charAt(i);
		   if(hmap.get(currentchar)==1) // we are checking the current character frquency if its value 1 so it is first non repeating character so we printing
		   {
			   System.out.println(currentchar);
			   
			   
			  bol= true;
			  break;
			    
		   }  
	   } 
	   if(bol== false)
		System.out.println(-1);
	}
}
