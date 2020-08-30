import java.util.Scanner;
public class lab112{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first number : ");
       int x = sc.nextInt();
       System.out.println("Enter the second number : ");
       int y = sc.nextInt();
       int fl=0;
       System.out.println("the two prime numbers between " + x + " and " + y);
       for (int i = x; fl<2&&i <= y; i++) {
           if (isPrime(i)) {
               System.out.println(i);
               fl=fl+1;
           }
       }
   }
   public static boolean isPrime(int n) {
       if (n <= 1) {
           return false;
       }
       for(int i = 2; i <= Math.sqrt(n); i++) {
           if (n % i == 0) {
               return false;
           }}
       return true;
   }}
