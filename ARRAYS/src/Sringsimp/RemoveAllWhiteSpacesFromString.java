package Sringsimp;
import java.util.Scanner;

public class RemoveAllWhiteSpacesFromString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String newStr=str.replaceAll(" ", "");// it will remove white spaces
		System.out.println(newStr);
		

	}

}
