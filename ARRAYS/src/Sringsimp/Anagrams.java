package Sringsimp;
import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		boolean status;
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		String r1=s1.replace(" ","");
		String r2=s2.replace(" ","");
		if(r1.length()!=r2.length())
			status=false;
		else {
		char ch1[]=r1.toLowerCase().toCharArray();
		char ch2[]=r2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		 status=Arrays.equals(ch1,ch2);
		}
		if(status)
			System.out.println("anargams");
		else
			System.out.println("which are not anargams");

	}

}
