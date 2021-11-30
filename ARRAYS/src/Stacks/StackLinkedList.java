package Stacks;

class Node{
	int data;
	Node next;
	Node(int data)
	{
	  this.data=data;
	  this.next=null;
	}
}

public class StackLinkedList {
	Node head=null;
	void push(int data)
	{  Node newnode=new Node(data);
	  if(head==null)
	  { head=newnode;
	  }
	  else {
	   newnode.next=head;
	   head=newnode;
	  }
	}
	int pop() {
		if(head==null)
		{
			System.out.println(" stack is empty");
			return -1;
		}
		int data=head.data;
		head=head.next;
		return data;
	}
	

}
