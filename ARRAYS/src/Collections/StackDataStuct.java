package Collections;
import java.util.Stack;

public class StackDataStuct {

	public static void main(String[] args) {
		  Stack<Integer> st=new Stack<>();
		  st.push(20);
		  st.push(30);
		  st.push(40);
		  System.out.println(st);
		 System.out.println( st.pop());
		 st.push(34);
		 System.out.println(st);
		 System.out.println(st.peek());// it will print the top elemet

	}

}
