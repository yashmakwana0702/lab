import java.lang.*;
import java.util.Scanner;
public class bubblesort {
  static void bubbleSort(int[] array) {
    int n = array.length;
    int temp = 0;
    for(int i=0; i < n; i++){
      for(int j=1; j < (n-i); j++){
        if(array[j-1] > array[j]){
          temp = array[j-1]; array[j-1] = array[j]; array[j] = temp;
        }
      }}}
public static void main(String[] args) throws InterruptedException{
   System.out.println("For Ascending Order INtegers Array a[]");
     int[] a = new int[4000];
     for(int i=1; i < 4000; i++) {
       a[i] = i;
     }
     double startTime = System.currentTimeMillis();
     bubbleSort(a);
   double endTime = System.currentTimeMillis();
   System.out.println("Execution time in micro seconds: "+(endTime - startTime)*1000);
   System.out.println(" 	");
   System.out.println("For Random Array c[]");
     int[] c = new int[4000];
     for(int i=1; i < 4000; i++) {
       c[i] = (int) Math.random();
     }
     double T3 = System.currentTimeMillis();
   bubbleSort(c);
 double T4 = System.currentTimeMillis();
   System.out.println("Execution time in micro seconds: "+(T4-T3)*1000);
   System.out.println(" ");
   System.out.println("For Descending Order INtegers Array b[]");
     int[] b = new int[4000];
     for(int i=1; i < 4000; i++) {
       b[i] = 4000-i;
     }
     double T1 = System.currentTimeMillis();
     bubbleSort(b);
double T2 = System.currentTimeMillis();
    System.out.println("Execution time in micro seconds: "+(T2 - T1)*1000);

}}
