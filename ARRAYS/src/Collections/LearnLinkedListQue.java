package Collections;
import java.util.Queue;
import java.util.Comparator;
import java.util.LinkedList;

public class LearnLinkedListQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		System.out.println(q);// it will add the elements  from the rea
		System.out.println(q.poll());// it will remve the elements from the front
		System.out.println(q);
	}

}
