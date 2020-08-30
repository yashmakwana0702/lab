import matplotlib.pyplot as plt

y1  =  [10993.58,34283.78,36978.72,46376.66,72558.02]
y2  =  [13192.13,17389.54,20783.95,25785.49,26984.26]
y3  =  [13191.56,16990.14,31985.86,34979.58,49571.70]

x1  =  [2000,  4000,  6000,  8000,  10000]
x2  =  x1
x3  =  x1

plt.plot(x1,  y1,  label= "Heap Sort", marker  =  'o'  ,markersize  =  5  ,  color  =  'blue',  markerfacecolor  =  'yellow')
plt.plot(x2,  y2,  label="Merge Sort", marker  =  'o'  ,markersize  =  5  ,  color  =  'darkorange'  ,  markerfacecolor  =  'red')
plt.plot(x3,  y3,  label="Quick Sort", marker  =  'o'  ,markersize  =  5  ,color  =  'purple'  ,  markerfacecolor  =  'pink')

plt.ylabel(' Time (micro-second)')
plt.xlabel(' Number of Element in Array')
plt.title(' Algorithms in an Random order array C[]')
plt.legend()
plt.show()
