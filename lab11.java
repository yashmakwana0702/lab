import java.util.Scanner;
public class lab11{
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int median;
        float mean=0;
        int [] ar = new int[5];
        for(int i=0;i<5;i++){
            ar[i] = sc.nextInt();
            mean= mean +ar[i];
        }
        mean= mean /5;
        System.out.println("the mean of the numbers is :"+mean);
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 5-i-1; j++)
                if (ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
             median = ar[3];
        System.out.println("the median of the numbers is :"+ med);
    }
}
