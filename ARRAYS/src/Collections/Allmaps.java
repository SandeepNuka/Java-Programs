package Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class Allmaps {

	public static void main(String[] args) {
		
   Map<Integer,Integer> mp=new HashMap<>();// it does not maintain order
   mp.put(22, 1);
   mp.put(11, 3);
   mp.put(19, 2);
   mp.put(66, 8);
   System.out.println(mp);
  // System.out.println(mp.get("three"));
   
  // for(Map.Entry<String,Integer> s:mp.entrySet()) // using this we can get the keys  and values
   //{ System.out.println(s);
   //System.out.println(s.getKey());
   //System.out.println(s.getValue());
   
   //}
   Map<Integer,Integer> lk=new LinkedHashMap<>();// it maintains  order
   lk.put(22, 1);
   lk.put(11, 3);
   lk.put(19, 2);
   System.out.println(lk);
   
   Map<Integer,Integer> tr=new TreeMap<>();// it maintains  keys sorted order
   tr.put(22, 1);
   tr.put(11, 3);
   tr.put(19, 2);
   System.out.println(tr);
   
   
       
   
	}

}
