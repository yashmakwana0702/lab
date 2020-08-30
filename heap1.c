#include<stdio.h>
#include<stdlib.h>
#define MAX 20

void maxheapify(int *, int, int);
int* buildmaxheap(int *, int);
void minheapify(int *, int, int);
int* buildminheap(int *, int);
int* heapsort(int* ,int ,int );

void maxheapify(int a[], int i, int heapsize)
{
    int temp, largest, left, right, k;
    left = (2*i+1);
    right = ((2*i)+2);
    if (left >= heapsize)
        return;
    else {
        if (left < (heapsize) && a[left] > a[i])
            largest = left;
        else
            largest = i;
        if (right < (heapsize) && a[right] > a[largest])
            largest = right;
        if (largest != i) {
            temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            maxheapify(a, largest, heapsize);
        }
    }
}

int* buildmaxheap(int a[], int n)
{
    int heapsize = n;
    int j;
    for (j = n/2; j >= 0; j--) {
        maxheapify(a, j, heapsize);
    }
    return a;
}

void minheapify(int a[], int i, int heapsize)
{
    int temp, min, left, right, k;
    left = (2*i+1);
    right = ((2*i)+2);
    if (left >= heapsize)
        return;
    else {
        if (left < (heapsize) && a[left] < a[i])
            min = left;
        else
            min = i;
        if (right < (heapsize) && a[right] < a[min])
            min = right;
        if (min != i) {
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            minheapify(a, min, heapsize);
        }
    }
}

int* buildminheap(int a[], int n)
{
    int heapsize = n;
    int j;
    for (j = n/2; j >= 0; j--) {
        minheapify(a, j, heapsize);
    }
    return a;
}

int* heapsort(int A[],int n,int a){
int i,temp,*q=A;
int *p = buildmaxheap(q,n);
if(a==1){
    for(i=n;i>0;i--){
        temp=p[0];
        p[0]=p[i];
        p[i]=temp;
        p=buildmaxheap(q,i);
        }
        }
        else{
        for(i=n;i>0;i--){
        temp=p[0];
        p[0]=p[i];
        p[i]=temp;
        p=buildmaxheap(q,i);
        }
    }
    return p;
}

int main(){
int c,d,arr[10]={1,4,7,13,2,12,32,9,5,8},s,i,n,t,abc[20];
int *min = calloc(MAX, sizeof(int));
int *m = calloc(MAX, sizeof(int));
int *h = calloc(MAX, sizeof(int));
int *max = calloc(MAX, sizeof(int));
int *b=abc,*a = arr,*q=arr;
while(1){
printf("\n Enter your choise:- ");
printf("\n 1. create max heap");
printf("\n 2. create min heap");
printf("\n 3. Convert random array into max heap");
printf("\n 4. Heapsort\n");
scanf("%d",&c);
switch(c){
case 1:  max = buildmaxheap(a, 10);
    printf("The heap is\n");
    for (t = 0; t < 10; t++) {
        printf("%d ", max[t]);
    }printf("\n");break;
case 2:  min = buildminheap(a, 10);
    printf("The heap is\n");
    for (t = 0; t < 10; t++) {
        printf("%d ", min[t]);
    }printf("\n");break;
case 3: printf("Enter no of elements in the array\n");
    scanf("%d", &n);
    printf("Enter the array\n");
    for (i = 0; i < n; i++) {
            printf("%d element\n",i+1);
        scanf("%d", &abc[i]);
    }
    m = buildminheap(b, n);
    printf("The max heap is\n");
    for (t = 0; t < n; t++) {
        printf("%d ", m[t]);
    }printf("\n");
         break;
case 4:  printf("\n Enter 1 for max heapsort and 2 for min heapsort ");
         scanf("%d",&d);
         if(d==1){
           h = heapsort(q,10,1);
         }else{
         h=heapsort(q,10,2);}
         for (t = 0; t < 10; t++) {
        printf("%d ", h[t]);}
        printf("\n"); break;
default: printf("\nInvalid Choice");break;
}
}
}
