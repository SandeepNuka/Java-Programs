package Collections;
import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		LinkedList<Integer> ls=new LinkedList<>();
		LinkedList<Character> lr=new LinkedList<>();
		LinkedList<String> lt=new LinkedList<>();
		lr.add('s');
		lr.add('a');
		lr.add('n');
		System.out.println(lr);
		lt.add("sandeep");
		lt.add("saikiran");
		lt.add("naveen");
		System.out.println(lt);
		ls.add(10);
		ls.add(20);
		ls.add(30);
		for(Integer s: ls)
		System.out.println(s);
		
		ls.add(2,3);
		System.out.println(ls);
		
		
		
	

	}

}
