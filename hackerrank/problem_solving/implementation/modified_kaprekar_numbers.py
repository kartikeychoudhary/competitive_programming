
import math
m=int(input())
n = int(input())
p=[]
for i in range (m,n+1):
    if(i==1):
        p.append(i)
    elif(i>3):
        temp=str(i*i)
        s=math.floor(len(temp)/2)
        tot=int(temp[:s])+int(temp[s:])
        if(i==tot):
            p.append(i)         
if(len(p)>0):
    for i in p:
        print(i,end=' ')
else:
    print('INVALID RANGE')
