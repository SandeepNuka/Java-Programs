package Sringsimp;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		Scanner  s=new Scanner(System.in);
		String strn=s.nextLine();
		//char chararry[]=strn.toCharArray();// it will convert string to char array
		//for(int i=chararry.length-1;i>=0;i--)
			//System.out.print(chararry[i]);
		for(int i=strn.length()-1;i>=0;i--)
			  System.out.print(strn.charAt(i)); // it will take each character from string
		
		
		

	}

}
