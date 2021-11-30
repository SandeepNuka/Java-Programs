package Sringsimp;
import java.util.Scanner;

public class StringFirstwordUpper {

	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  String sr=s.nextLine();
	  String arr[]=sr.split(" ");
	  
	  String output="";
	  int count;
	  for(String strin:arr)
	  { count=0;
		 String mid="";
		 for(int i=0;i<strin.length();i++)
		 {  if(count==0)
		 {  char ch=strin.charAt(i);
			 mid=mid+Character.toUpperCase(ch);// it will convert char to uperrcase
			 count++;
		 }
		 else
		 {
			 mid=mid+strin.charAt(i);
		 }
			 
		 }
		 output=output+mid+" ";
	  }
	  System.out.println(output);

	}

}
