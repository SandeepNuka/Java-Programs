package Sringsimp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOfEachCharacterInString {

	public static void main(String[] args) {
		LinkedHashMap<Character,Integer> lm=new LinkedHashMap<>(); 
		Scanner s=new Scanner(System.in);
		String sr=s.nextLine();
		for(int i=0;i<sr.length()-1;i++)
		{
			if(!lm.containsKey(sr.charAt(i)))
			{   lm.put(sr.charAt(i), 1);	
			}
			else
			{  int value=lm.get(sr.charAt(i));
			    lm.put(sr.charAt(i), 1+value);
				
			}
		}
		for(Map.Entry<Character, Integer> ss:lm.entrySet())//using this we can give key and values to ss 
		{ System.out.print(ss+" ");	}
	}

}
