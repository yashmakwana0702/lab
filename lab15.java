import java.util.Scanner;
public class lab15{
   public static void main (String args[]){
      int n,i;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      n = sc.nextInt();
      i=n%2;
      if (i==0){
        System.out.println("the given number is even "+ n);
      }
      else {
        System.out.println("the given number is odd "+n);
      }
}}
