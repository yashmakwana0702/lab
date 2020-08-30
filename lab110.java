import java.util.Scanner;
public class lab110{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
  int i;
  int fact=1;
  System.out.println("enter the number");
  int number=sc.nextInt();
  for(i=1;i<=number;i++){
      fact=fact*i;
  }
  System.out.println("Factorial of "+number+" is: "+fact);
 }
}
