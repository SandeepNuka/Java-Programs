package Strings;
import java.util.*;
public class RemovingDblicatesFromString {

	public static void main(String[] args) {
		String str="spelling";
		int  strlen=str.length();
		Map<Character,Integer> hmap=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<strlen;i++)
		{
			Character currentchar=str.charAt(i);
			if(hmap.containsKey(currentchar)==false)
			{
			  hmap.put(currentchar, 1);
			}
			else
			{ int frequency =hmap.get(currentchar);
			   frequency=frequency+1;
			   hmap.put(currentchar, frequency);	
			}
		}
		String res="";
		Set<Map.Entry<Character,Integer>> lheap=hmap.entrySet();
		for(Map.Entry<Character,Integer> data: lheap)
		{
			res=res+data.getKey();
		}
		
		System.out.println(res);
	}

}
