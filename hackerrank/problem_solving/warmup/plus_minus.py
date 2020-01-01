#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the plusMinus function below.
def plusMinus(arr):
    n=0
    p=0
    z=0
    count=0
    for i in arr:
        if i<0:
            n+=1
        elif i>0:
            p+=1
        else:
            z+=1
        
        count+=1
        
    print('%.6f'%(p/count))
    print('%.6f'%(n/count))
    print('%.6f'%(z/count))
    
    

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)

