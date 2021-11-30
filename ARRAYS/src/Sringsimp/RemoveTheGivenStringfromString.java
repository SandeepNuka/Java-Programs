package Sringsimp;
import  java.util.Scanner;

public class RemoveTheGivenStringfromString 
{
	public static void main(String[] args) {
		String req="";
		Scanner s=new Scanner(System.in);
		String sr=s.nextLine();
		String strn=s.nextLine();
		String str[]=sr.split(" ");// it will split string into character array
		for(String c:str)
		{ if(!(c.equals(strn)))
			{req=req+c+" ";
		
			}
		}

System.out.println(req);
	}
}
