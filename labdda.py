import time
import random

'''
Mergesort algorithm
'''
def Merge(Array, first, mid, last):
    i = first
    j = first
    m = mid + 1

    temp = [0]*(last - first + 1)
    k = 0

    while j <= last:

        if(i > mid):
            temp[k] = Array[m]
            m += 1

        elif m > last:
            temp[k] = Array[i]
            i += 1

        elif Array[i] < Array[m]:
            temp[k] = Array[i]
            i += 1

        else:
            temp[k] = Array[m]
            m += 1

        k += 1
        j += 1

    flag = 0
    while flag < k:
        Array[first] = temp[flag]
        first += 1
        flag += 1

def MergeSort(Array ,first,lArrayst):
    if first<lArrayst:
        mid = (first+lArrayst)//2

        MergeSort(Array , first , mid)
        MergeSort(Array , mid+1 , lArrayst)

        Merge(Array , first , mid , lArrayst)
    else:
        return
#QUICKSORT algorithm
def Quicksort(Array, first , last):
    if(first < last):
        pivot = randpivot(Array, first, last)
        Quicksort(Array , first , pivot - 1)
        Quicksort(Array, pivot + 1, last)

def randpivot(Array , first, last):
    randpivot = random.randrange(first, last)
    Array[first], Array[randpivot] = Array[randpivot], Array[first]
    return partition(Array, first, last)

def partition(Array,first,last):
    pivot = first
    i = first + 1
    for j in range(first + 1, last + 1):

        if Array[j] <= Array[pivot]:
            Array[i] , Array[j] = Array[j] , Array[i]
            i = i + 1
    Array[pivot] , Array[i - 1] = Array[i - 1] , Array[pivot]
    pivot = i - 1
    return (pivot)


# driver code to run program
#Performing MERGE SORT::

print("Output :-")
print("_______________________________________________________________________")
print("_______________________________________________________________________")
'''
merge sort for ascending order elements
elements = 10000
'''
A_merge = []

time_Insertion_1 = time.time()
for i in range(1 , 10001):
    A_merge.append(i)
MergeSort(A_merge, 0 , len(A_merge) - 1)
time_Insertion_2 = time.time()

print("Algorithm: MERGE SORT  ;    elements : 10000  ;  Type of array: A(ascending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")

'''
Mergesort for descending order elements:
elements = 10000
'''
B_merge = []

time_Insertion_1 = time.time()
for i in range(10001 , -1 , -1):
    B_merge.append(i)
MergeSort(B_merge, 0 , len(B_merge) - 1)
time_Insertion_2 = time.time()

print("Algorithm: MERGE SORT  ;  elements : 10000  ;  Type of array: B(descending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")
'''
Mergesort for RANDOM order elements:
elements = 10000
'''
C_merge = []

time_Insertion_1 = time.time()
for i in range(1, 10001):
    j = random.randint(1 , 10000)
    C_merge.append(j)
MergeSort(C_merge, 0 , len(C_merge) - 1)
time_Insertion_2 = time.time()

print("Algorithm: MERGE SORT  ;  elements : 10000  ;  Type of array: C (RANDOM order)) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")
print("__________________________________________________________________________________")

'''
Quicksort for ascending order elements
elements = 10000
'''
A_quick = []

time_Insertion_1 = time.time()
for i in range(1 , 10001):
    A_quick.append(i)
Quicksort(A_quick, 0 , len(A_quick) - 1)
time_Insertion_2 = time.time()

print("Algorithm: QUICKSORT  ;    elements : 10000  ;  Type of array: A(ascending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")
'''
Quicksort for descending order elements:
elements = 10000
'''
B_quick = []

time_Insertion_1 = time.time()
for i in range(10001 , -1 , -1):
    B_quick.append(i)
Quicksort(B_quick,0 , len(B_quick) - 1)
time_Insertion_2=time.time()

print("Algorithm: QUICKSORT  ;  elements : 10000  ;  Type of array: B(descending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")

C_quick=[]

time_Insertion_1=time.time()
for i in range(1,10001):
    j=random.randint(1,10000)
    C_quick.append(j)
Quicksort(C_quick, 0 , len(C_quick) - 1)
time_Insertion_2 =time.time()

print("Algorithm: QUICKSORT ; elements :10000 ; Type of array:C(RANDOMorder)) :-")
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1)*200000}  microseconds")
print("__________________________________________________________________________________")
#endtime
