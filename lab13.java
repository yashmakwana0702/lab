import java.util.Scanner;
public class lab13{
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l,b;
        double area;
        System.out.println("enter the lenght of rectangle");
        l = sc.nextInt();
        System.out.println("enter the breath of rectangle");
        b = sc.nextInt();
        area= l * b;
        System.out.println("the area of the rectangle is : "+ area);

    }
}
