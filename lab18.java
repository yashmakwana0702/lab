import java.util.Scanner;
public class lab18{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int n =sc.nextInt();
      int f1 = 0, f2 = 1, i;
      if (n < 1)
          return;
      System.out.print(f1+" ");
      for (i = 1; i <= n; i++){
          System.out.print(f2+" ");
          int next = f1 + f2;
          f1 = f2;
          f2 = next;
    }
  }
}
