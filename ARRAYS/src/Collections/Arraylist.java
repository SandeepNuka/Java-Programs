package Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class Arraylist {

	public static void main(String[] args) {
  ArrayList<Integer> ar=new ArrayList<>();
  List<Integer> as=new ArrayList<>();
  ArrayList<String> ss=new ArrayList<>();
   int arr[]= {8,7,6,5,4,3,2,1};
   Arrays.sort(arr);// using this we can sort the normal arrays
     ss.add("sandeep");
     ss.add("saikiran");
     ss.add("naveen");
     ar.add(10);
     ar.add(20);
     ar.add(30);
     as.add(40);
     as.add(50);
     as.add(60);
     //for(Integer s:ar)
    	// if(s%2==0)
    		// System.out.println(s);
     ar.addAll(as);
     System.out.println(ar);
     ar.add(1,25);
     ar.add(5,27);// this add and set method are same it will add add specified index
     ar.set(2,18);
     //ar.remove(1);
      // System.out.println( ar.remove(4));//this will remove the element of index4 and also return the removed element
       //System.out.println( ar.remove(Integer.valueOf(60))); // this will remove the element and it will return true or false 
    
     System.out.println(ar);
     Collections.sort(ar);// using this we can sort the collection
     System.out.println(ar);
   //for(Integer s:ar) // for each loop it will take the each elemet from arraylist
 	 //if(s%2==0)
 		// System.out.print(" "+s);
  // System.out.println();
   //System.out.println(ar.size());// it will print the size of the  list 
     
    // ar.clear();// it will clear the all the elements
     //System.out.println(ar);
   System.out.println(ss);
   System.out.println(ss.contains("sandeep"));// it will tell the element present or not
   System.out.println(ss.isEmpty());
   Collections.sort(ss);
   System.out.println(ss); // it will tell whether the list is empty or not
  
 for(Integer k:arr) 
		 System.out.print(" "+k);
 System.out.println();
 for(int i=0;i<ar.size();i++)// length method is not support for arraylist insted it support size();
 {
	 System.out.println(ar.get(i));
 }
 int index=Arrays.binarySearch(arr, 6);
 System.out.println();
 System.out.println(index);
  
 

	}

}
