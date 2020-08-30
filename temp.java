import java.util.*;
public class temp {
  int size;
  final int maxSize;
  int[] heap;
  boolean isMaxHeap;
  temp(int maxSize) {
    this.maxSize = maxSize;
    heap = new int[this.maxSize];
    this.size = 0;
  }
  int getParent(int curr) {
    return (curr / 2);
  }
  int leftChild(int curr) {
    return (curr * 2 + 1);
  }
  int rightChild(int curr) {
    return (curr * 2 + 2);
  }
void swap(int[] arr,int a, int b) {
  int temp;
  temp = arr[a];
  arr[a] = arr[b];
  arr[b] = temp;
}
void heapify(int[] arr,int curr,int size){
  if(isMaxHeap == true){
    maxHeapify(arr,curr,size);
  } else {
    minHeapify(arr,curr,size);
  }
}
void maxHeapify(int[] arr,int curr,int size) {
  int left = leftChild(curr);
  int right = rightChild(curr);
  int largest = curr;
  if (left < size && arr[left] > arr[curr]){
    largest = left;
  }
  if(right < size && arr[right] > arr[largest]){
    largest = right;
  }
  if(largest != curr){
    swap(arr,largest,curr);
    maxHeapify(arr,largest,size);
  }
}
void minHeapify(int[] arr,int curr,int size) {
  int left = leftChild(curr);
  int right = rightChild(curr);
  int smallest = curr;
  if (left < size && arr[left] < arr[curr]){
    smallest = left;
  }
  if(right < size && arr[right] < arr[smallest]){
    smallest = right;
  }
  if(smallest != curr){
    swap(arr,smallest,curr);
    minHeapify(arr, smallest,size);
  }
}
void insert(int data){
  if(size > 100){
    System.out.printf("\nstorage limit reached\n");
  }
  heap[size++] = data;
  for (int i = size/2 - 1; i >= 0; i--){
    heapify(heap,i,size);
  }
}
void extractRoot(int[] arr,int i){
  swap(arr,0,i);
  heapify(arr,0,i);
  }
void heapSort(int[] arr){
  int[] sorted = new int[size];
  System.arraycopy(heap, 0, sorted, 0, size);
  int i = size-1;
  while(i > 0){
    extractRoot(sorted,i);
    i--;
  }
  System.out.printf("After sorting ");
  printHeap(sorted,size);
}
void printHeap(int[] arr,int size){
  if(size == 0){return;}
  System.out.printf("The heap is:--");
  for (int i = 0; i < size; i++) {
    System.out.printf(arr[i] + " ");
  }
  System.out.printf("\nheap size %d\n",size);
}
void toHeap(int[] arr,int size){
  for (int i = size/2 -1; i >= 0; i--) {
    heapify(arr, i, size);
  }
}
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  temp heaptree = new temp(100);
  System.out.printf("Choose the type of heap");
  System.out.printf("\n1 -> max heap\n2 -> min heap\nchoice :- ");
  int temp = sc.nextInt();
  heaptree.isMaxHeap = (temp == 1)?true:false;
  System.out.println("MENU\n1 -> insert\n2 -> Heap Sort" );
  System.out.println("3 -> change array to heap\n4 -> print");
  int choice;
  do {
    System.out.printf("choice :- ");
    choice = sc.nextInt();
    switch (choice) {
      case 1:System.out.printf("enter the No. values to be inserted :- ");
      int x,y=0;
      x= sc.nextInt();
      for (y=0;y<x ;y++ ) {
        System.out.printf("enter the value to be inserted :- ");
        int newData = sc.nextInt();
        heaptree.insert(newData);
      }
      heaptree.printHeap(heaptree.heap,heaptree.size);
      break;
      case 2:
      heaptree.heapSort(heaptree.heap);
      break;
      case 4:
    heaptree.printHeap(heaptree.heap,heaptree.size);
    break;
    case 3:
    System.out.printf("number of elements of array :- ");
    int n = sc.nextInt();
    System.out.printf("enter the array as space separsted list :- ");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    heaptree.toHeap(arr,n);
    heaptree.printHeap(arr,n);
  }
  }
   while (choice != 0);
   sc.close();
 }
}
