package Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class AllSets {

	public static void main(String[] args) {
     Set<Integer> h=new HashSet<>(); // it will not allow dublicates and it does not maintain orderm
       h.add(10);
       h.add(22);
       h.add(33);
       h.add(29);
       h.add(10);
       System.out.println(h);
       Set<Integer> l=new LinkedHashSet<>(); // it will not allow dublicates and it  maintain orderm
       l.add(10);
       l.add(22);
       l.add(33);
       l.add(29);
       l.add(10);
       System.out.println(l);
       
       Set<Integer> t=new TreeSet<>(); // it will not allow dublicates and it sort the elemets
       t.add(10);
       t.add(22);
       t.add(33);
       t.add(29);
       t.add(10);
       System.out.println(t);
       
      
      
     

	}

}
