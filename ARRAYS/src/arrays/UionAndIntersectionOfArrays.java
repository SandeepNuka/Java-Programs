package arrays;
import java.util.HashSet;

public class UionAndIntersectionOfArrays {

	public static void main(String[] args) {
		int [] firstArray= {2,5,6};
		int [] secondArray= {4,6,8,10};     /* time complexity is o(n)*/
		HashSet<Integer> set =new HashSet<>();
		HashSet<Integer> set1 =new HashSet<>();
		for(int i=0;i<firstArray.length;i++)
			set.add(firstArray[i]);
		for(int j=0;j<secondArray.length;j++)
			if(! set.contains(secondArray[j]))
			{
				set.add(secondArray[j]);
			}
			else
			{ if(set.contains(secondArray[j]))
			  set1.add(secondArray[j]);
			}
			
		System.out.println("Union of Two Arrays is"+set);
		System.out.println("Intersection of Two Arrays is"+set1);

	}

	
}
