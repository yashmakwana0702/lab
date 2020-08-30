import java.util.Scanner;
public class lab115{
  public static void main(String[] args)  {
    int c=0,a,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter  the nuber to check");
    int n=sc.nextInt();
    temp=n;
    while(n>0){
      a=n%10;
      n=n/10;
      c=c+(a*a*a);
    }
    if(temp==c)
      System.out.println("armstrong number");
    else
      System.out.println("Not armstrong number");
   }
}  
