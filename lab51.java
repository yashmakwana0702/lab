import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
class account {
    Scanner sc = new Scanner(System.in);
    static int accno,PIN,balance;
    static String name;
    void openAccount() {
        System.out.print("Enter Account No: ");
        accno = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextInt();
      }
    double AccountCharges(double n) {
        double x = n;
        x = (0.10) * x;
        if (x < 50) {
            return x;
        } else {
            x = 50;
            return x;
        }
    }
    double Interest(double n) {
        double x = n * (0.07);
        return x;
    }

static void deposit() {
        long amt;
        System.out.println("Enter Amount U Want to Deposit : ");
        amt = sc.nextLong();
        balance = balance + amt;
    }

  }
class regular extends account{
  @Override
  double Interest(double n) {
      return 0;
  }double Penalty(double n) {
      if (n < 500) {
          return 100;
      } else {
          return 0;
      }
  }
}
   void withdrawal() {
        long amt;
        System.out.println("Enter Amount U Want to withdraw : ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }
        System.out.println("The remaining balance is : "+amt);
        if(amt>500){
          System.out.println(" the Account balance is less then 500 so 100 rupee is deducted");
          amt=amt-100;
        }
    }
}
class Checking extends account{
  @Override
  double Penalty(int n) {

      if (n < 1000) {
          return 50;
      } else {
          return 0;
      }
  }
  void withdrawal() {
        long amt;
        System.out.println("Enter Amount U Want to withdraw : ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }
  }
class cdacc extends account{
  @Override
  double Interest(double n) {
    double x = n * (0.15);
    return x;
  }
double Penalty(double n) {
    System.out.println("Penalty due to withdrawal before 12 months.");
    double x = n * (0.2);
    return x;
  }
  void withdrawal() {
        long amt;
        System.out.println("Enter Amount U Want to withdraw : ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }
}
public class lab51{
  public static void main(String[] args) {
    account[] acc = new account[100];
    System.out.println("enter 1 to create new account enter 2 to for Exist account");
    Scanner sc= new Scanner(System.in);
    int a= sc.newxtInt();
    if(a==1){
      System.out.println("enter which type of account you want");
      System.out.println(" 1. regular account");
      System.out.println(" 2. Interest Account");
      System.out.println(" 3. Checking Account ");
      System.out.println(" 4. CD account");
      int x = sc.nextInt();
      if(x==1){
        regular[] ob=new regular[i];
        System.out.println("The account no is : "+i +"enter your PIN ");
        int p=sc.nextInt();
        System.out.println("the the starting account amount");
        long q=sc.nextInt();

        i++;
      System.out.println("enter which type of account you have");
      System.out.println(" 1. regular account");
      System.out.println(" 2. Interest Account");
      System.out.println(" 3. Checking Account ");
      System.out.println(" 4. CD account");
      int x = sc.nextInt();
      if(x==1){

      }else if (x==2) {

      }else if (x==3) {

      }else if (x==4) {

      }
    }
  }}}
