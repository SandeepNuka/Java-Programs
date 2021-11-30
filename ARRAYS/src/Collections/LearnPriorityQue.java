package Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pr=new PriorityQueue<>();
		PriorityQueue<Integer> ps=new PriorityQueue<>(Comparator.reverseOrder());
		pr.offer(20);
		pr.offer(30);
		pr.offer(22);
		pr.offer(50);
		System.out.println(pr);// it  follwing min heap
		 System.out.println(pr.peek());
	  System.out.println(pr.contains(30));
	  ps.offer(41);
	  ps.offer(2);
	  ps.offer(8);
	  ps.offer(38);
	  
	  System.out.println(ps);// it print max heap
	  
	  System.out.println(ps.poll());
	  System.out.println(ps);
      System.out.println(ps.peek());
	}

}
