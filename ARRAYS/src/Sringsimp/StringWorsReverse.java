package Sringsimp;
import java.util.Scanner;

public class StringWorsReverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String sr=s.nextLine();
		String str[]=sr.split(" "); // it will split the words according to spaces and stroes in string array
		 
		String output="";
		for(String word:str)
		{
			String strin="";
			for(int i=word.length()-1;i>=0;i--)
				{strin=strin+word.charAt(i);}
			
			    output=output+strin+" ";
		}
		System.out.print(output);

	}

}
