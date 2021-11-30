package Stacks;

public class StackArray {
	int top=-1;
	int max=3;
	int arr[]=new int[max];
	
	boolean isFull()
	{
		if(top==(max-1))
		  return true;
		return false;
	}
	
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	
	boolean push(int data)
	{  if(isFull()) {
		System.out.println("The stack is full");
		return false;
	}
	  arr[++top]=data;
	    return true;
	    
	}
      int pop()
      { if(isEmpty())
      {
    	  System.out.println("The stack is empty");
      }
        int data=arr[top];
        top=top-1;
        return data;
    	  
      }
      int peek()
      { if(isEmpty())
      {   System.out.println(" the is empty"); 
      }
        return arr[top];
      }
}
