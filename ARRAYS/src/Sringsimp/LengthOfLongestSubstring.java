package Sringsimp;
import java.util.HashMap;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
	  LengthofLongestsubstring("PWWKEW");

	}
	public static  void LengthofLongestsubstring(String s)
	{ int lenthofString=0;
	  String requiredsubstring="null";
	 char chararray[]=s.toCharArray();
	 HashMap<Character,Integer> hm=new HashMap<>();
	 for(int i=0;i<chararray.length-1;i++)
	 {
		 if(!hm.containsKey(chararray[i]))
		 {  hm.put(chararray[i], i);
			 
		 }
		 else
		 {//mi=hm.get(chararray[i]);
			 hm.clear();
			 hm.put(chararray[i], 1);
		 }
	 if(hm.size()>lenthofString)
		 lenthofString=hm.size();
	  
		
	}
	System.out.println(lenthofString);

}
}
