import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.concurrent.TimeUnit;

public class heapin {
	static void heapify(int arr[],int n,int i) {
		 int parent = (i - 1) / 2;
		    if (arr[parent] > 0) {
		        if (arr[i] > arr[parent]) {
		            int temp=arr[i];
		           arr[i]=arr[parent];
		          arr[parent]=temp;
		            heapify(arr, n, parent);
		        }}
	}
	static void insertNode(int arr[],int n,int key) {
			arr[n]=key;
		 	heapify(arr, n+1, n);
	}
public static void main(String args[]) {
   	Scanner sc=new Scanner(System.in);
   	int t=5;int n=0;
   	while(t>0) {
	   t--;
    n+=2000;
		int arr[]=new int[n+2];
		for(int i=0;i<n;i++) {
			arr[i]=i+1;
		}
		int key = 15;
	  long starttime=System.currentTimeMillis();
	  for(int i=n;i>0;i--) {
			heapify(arr,n,i);
		}
	  for(int i=0;i<20000;i++) {
    insertNode(arr, 2000, key); }
    long endtime=System.currentTimeMillis();
    System.out.println("Execution time in micro seconds for array A[] with "+n+" elements " +(starttime-endtime)*1000);
		System.out.println("Exection time -- "+System.currentTimeMillis());
}
}}
