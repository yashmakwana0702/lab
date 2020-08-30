import java.util.Scanner;
public class heapdel {
	static void heapify(int arr[],int n,int i) {
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[l]>arr[largest]) {
			largest=l;
		}
		if(r<n && arr[r]>arr[largest]) {
			largest=r;
		}
		if(largest!=i) {
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,n,largest);
		}
	}
	 static int deleteNode(int arr[], int n){
		 int lastElement = arr[n - 1];
		 int temp=arr[0];
		 arr[0] = lastElement;
		 n = n - 1;
		 heapify(arr, n, 0);
		 return temp;
	    }
	public static void main(String args[]) {
		   Scanner sc=new Scanner(System.in);
		   int t=5;  int n=0;
		   while(t>0) {
			   t--;
		  n+=2000;
			int arr[]=new int[n+2];
			for(int i=0;i<n;i++) {
				arr[i]=i+1;
			}
 		long starttime=System.currentTimeMillis();
	 for(int i=n/2;i>=0;i--) {
					heapify(arr,n,i);
				}
			  for(int i=0;i<20000;i++) {
		    int ele=deleteNode(arr, n);
		    }
		    long endtime=System.currentTimeMillis();
				System.out.println("Execution time in micro seconds for array A[] with "+n+" elements " +(starttime-endtime)*1000);
				System.out.println("Exection time "+ System.currentTimeMillis());
		}
		}
}
