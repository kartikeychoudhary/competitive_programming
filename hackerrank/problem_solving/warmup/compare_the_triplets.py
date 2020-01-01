#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the compareTriplets function below.
def compareTriplets(a, b):
    x=0
    y=0
    for i in range(len(a)):
        if a[i]>b[i]:
            x+=1
        elif a[i]<b[i]:
            y+=1
              
    s=[x,y]
    return s

if __name__ == '__main__':
    

    a = list(map(int, input().rstrip().split()))

    b = list(map(int, input().rstrip().split()))

    result = compareTriplets(a, b)
    print(result)
