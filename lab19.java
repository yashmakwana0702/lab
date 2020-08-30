import java.util.Scanner;
public class lab19{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int n =sc.nextInt();
      int i;
      for (i = 1; i <=10; i++){
        int x=n*i;
          System.out.print(x+" ");
    }
  }
}
