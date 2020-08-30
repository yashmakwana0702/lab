import java.util.Scanner;
public class lab111{
 public static void main(String args[]){
  int i,m=0,fl=0;
  System.out.println("enter the nuber to check prime ");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  m=n/2;
  if(n==0||n==1){
   System.out.println(n+" is not prime number");
  }else{
    for(i=2;i<=m;i++){
      if(n%i==0){
        System.out.println(n+" is not prime number");
        fl=1;
        break;
      }}
   if(fl==0){ System.out.println(n+" is prime number"); }
  }}}
