import java.util.Scanner;
public class lab116{
    public static void main(String[] args) {
    	int year;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter any Year:");
    	year = sc.nextInt();
    	sc.close();
        boolean check = false;
        if(year % 4 == 0){
            if( year % 100 == 0){
                if(year%400 == 0)
                    check = true;
                else
                    check = false;
            }
            else
                check = true;
        }
        else {
            check = false;
        }
        if(check==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
  }
