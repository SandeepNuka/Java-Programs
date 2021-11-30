package Sringsimp;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class RemoveDublicateCharacterInGivenString {

	public static void main(String[] args) {
		Scanner s=new  Scanner(System.in);
		String  sr=s.nextLine();
	    StringBuilder br=new StringBuilder();
		LinkedHashSet<Character> ls=new LinkedHashSet<>();// it wont take dublicates and maintian order
		for(int i=0;i<sr.length();i++)
			 ls.add(sr.charAt(i));
		 for(Character c:ls)
		 { br.append(c);
			 
		 }
 System.out.println(br);
	}

}
