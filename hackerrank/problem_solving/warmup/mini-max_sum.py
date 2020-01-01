#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the miniMaxSum function below.
def miniMaxSum(arr):
    
    arr = sorted(arr)
#    print(arr)
    max=0
    min=0
    count=0
    for i in range(len(arr)):
        max+=arr[-i-1]
        min+=arr[i]
        count+=1
        if count >3:
            break
    
    print(str(min)+' '+str(max))
    

if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)

