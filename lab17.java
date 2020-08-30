import java.util.Scanner;
public class lab17{
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int [] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < 5-i-1; j++)
                if (ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
        System.out.println("the largest three of these numbers are : ");
        System.out.print(ar[n-1]+" ");
        System.out.print(ar[n-2]+" ");
        System.out.print(" "+ar[n-3]);
    }
}
