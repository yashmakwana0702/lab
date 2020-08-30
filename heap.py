import time
import random
def heapify(arr, n, i):
    largest = i
    l = 2 * i + 1
    r = 2 * i + 2
    if l < n and arr[i] < arr[l]:
        largest = l
    if r < n and arr[largest] < arr[r]:
        largest = r
    if largest != i:
        arr[i],arr[largest] = arr[largest],arr[i]  # swap
        heapify(arr, n, largest)

def heapSort(arr):
    n = len(arr)
    for i in range(n // 2 - 1, -1, -1):
        heapify(arr, n, i)
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]   # swap
        heapify(arr, i, 0)
print("__________________________________________________________________________________")
A = []

time_Insertion_1 = time.time()
for i in range(1 , 2001):
    A.append(i)
heapSort(A)
time_Insertion_2 = time.time()
print("Algorithm: Heap Sort  ;    elements : 2000  ;  Type of array: A(ascending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")
#endtime
B = []
time_Insertion_1 = time.time()
for i in range(2001 , -1 , -1):
    B.append(i)
heapSort(B)
time_Insertion_2=time.time()
print("Algorithm: heapSort  ;  elements : 2000  ;  Type of array: B(descending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")
C=[]
time_Insertion_1=time.time()
for i in range(1,2001):
    j=random.randint(1,2000)
    C.append(j)
heapSort(C)
time_Insertion_2 =time.time()
print("Algorithm: heapSort ; elements :2000 ; Type of array:C(RANDOMorder)) :-")
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1)*200000}  microseconds")
print("__________________________________________________________________________________")
print("__________________________________________________________________________________")
A = []

time_Insertion_1 = time.time()
for i in range(1 , 4001):
    A.append(i)
heapSort(A)
time_Insertion_2 = time.time()
print("Algorithm: Heap Sort  ;    elements : 4000  ;  Type of array: A(ascending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")
#endtime
B = []
time_Insertion_1 = time.time()
for i in range(4001 , -1 , -1):
    B.append(i)
heapSort(B)
time_Insertion_2=time.time()
print("Algorithm: heapSort  ;  elements : 4000  ;  Type of array: B(descending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")
C=[]
time_Insertion_1=time.time()
for i in range(1,4001):
    j=random.randint(1,4000)
    C.append(j)
heapSort(C)
time_Insertion_2 =time.time()
print("Algorithm: heapSort ; elements :4000 ; Type of array:C(RANDOMorder)) :-")
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1)*200000}  microseconds")
print("__________________________________________________________________________________")
print("__________________________________________________________________________________")
A = []

time_Insertion_1 = time.time()
for i in range(1 , 6001):
    A.append(i)
heapSort(A)
time_Insertion_2 = time.time()
print("Algorithm: Heap Sort  ;    elements : 6000  ;  Type of array: A(ascending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")
#endtime
B = []
time_Insertion_1 = time.time()
for i in range(6001 , -1 , -1):
    B.append(i)
heapSort(B)
time_Insertion_2=time.time()
print("Algorithm: heapSort  ;  elements : 6000  ;  Type of array: B(descending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")
C=[]
time_Insertion_1=time.time()
for i in range(1,6001):
    j=random.randint(1,6000)
    C.append(j)
heapSort(C)
time_Insertion_2 =time.time()
print("Algorithm: heapSort ; elements :6000 ; Type of array:C(RANDOMorder)) :-")
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1)*200000}  microseconds")
print("__________________________________________________________________________________")
print("__________________________________________________________________________________")
A = []

time_Insertion_1 = time.time()
for i in range(1 , 8001):
    A.append(i)
heapSort(A)
time_Insertion_2 = time.time()
print("Algorithm: Heap Sort  ;    elements : 8000  ;  Type of array: A(ascending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")
#endtime
B = []
time_Insertion_1 = time.time()
for i in range(8001 , -1 , -1):
    B.append(i)
heapSort(B)
time_Insertion_2=time.time()
print("Algorithm: heapSort  ;  elements : 8000  ;  Type of array: B(descending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")
C=[]
time_Insertion_1=time.time()
for i in range(1,8001):
    j=random.randint(1,8000)
    C.append(j)
heapSort(C)
time_Insertion_2 =time.time()
print("Algorithm: heapSort ; elements :8000 ; Type of array:C(RANDOMorder)) :-")
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1)*200000}  microseconds")
print("__________________________________________________________________________________")
print("__________________________________________________________________________________")
A = []

time_Insertion_1 = time.time()
for i in range(1 , 10001):
    A.append(i)
heapSort(A)
time_Insertion_2 = time.time()
print("Algorithm: Heap Sort  ;    elements : 10000  ;  Type of array: A(ascending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")
#endtime
B = []
time_Insertion_1 = time.time()
for i in range(10001 , -1 , -1):
    B.append(i)
heapSort(B)
time_Insertion_2=time.time()
print("Algorithm: heapSort  ;  elements : 10000  ;  Type of array: B(descending order) :-")
#runtime in seconds and microseconds
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1) * 200000} microseconds")
print("__________________________________________________________________________________")
C=[]
time_Insertion_1=time.time()
for i in range(1,10001):
    j=random.randint(1,10000)
    C.append(j)
heapSort(C)
time_Insertion_2 =time.time()
print("Algorithm: heapSort ; elements :10000 ; Type of array:C(RANDOMorder)) :-")
print(f"{time_Insertion_2 - time_Insertion_1} seconds")
print(f"{(time_Insertion_2 - time_Insertion_1)*200000}  microseconds")
print("__________________________________________________________________________________")
#endtime
