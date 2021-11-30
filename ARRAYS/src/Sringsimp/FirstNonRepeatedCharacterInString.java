package Sringsimp;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;


public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		Scanner  s=new Scanner(System.in);
		String str=s.nextLine();
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();// it will mantain the order
		for(int i=0;i<str.length();i++)
		{	if(!map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i),1);
			}
			else
			{ int value=map.get(str.charAt(i));
			   map.put(str.charAt(i),1+value);
				
			}
	}
	
	for(Map.Entry<Character,Integer>lp:map.entrySet())
	{ if(lp.getValue()==1)// using this we can get the value
	{ System.out.println(lp.getKey());// using this we can get the key
	 break;
	}
		
	}
	}
	
	
	
}
