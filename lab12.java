import java.util.Scanner;
public class lab12{
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rad;
        double area,cum;
        System.out.println("enter the radius of circle");
        rad = sc.nextInt();
        double pi = 3.141;
        area= pi*rad*rad;
        cum =  2 * pi * rad;
        System.out.println("the area of the circle is : "+ area);
        System.out.println("the circumference of the cicle is : "+ cum );
    }
}
