package arrays;

//digital question 11 15 output 4
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
       int count=0;
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      for(int i=n1;i<=n2;i++)
      { if(checknumber(i)==1)
         count++;
          
      }
      System.out.print(count);
  }
 
   public static int checknumber(int n)
  { int r;
  ArrayList<Integer> ar=new ArrayList<>();
      while(n>0)
      { r=n%10;
      if(ar.contains(r))
         return 0;
       else
       ar.add(r);
       n=n/10;
      }
      return 1;
      
  }
 
}    

