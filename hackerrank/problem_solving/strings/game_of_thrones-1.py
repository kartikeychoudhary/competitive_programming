#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the gameOfThrones function below.
def gameOfThrones(s):
    arr = s

    temp=[]
    while len(arr)>0:
        temp.append(arr[0])
        arr = arr.replace(arr[0], "")
    
    count=[]
    print(temp)
    for j in temp:
        c =0
        for k in range(len(s)):
            if j == s[k]:
                c+=1
        
        count.append(c)
    
    print (count)
    odd=0
    for i in count:
        if i % 2 != 0:
            odd+=1
    
    if odd < 2:
        return "YES"
    else:
        return "NO"
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = gameOfThrones(s)

    fptr.write(result + '\n')

    fptr.close()

