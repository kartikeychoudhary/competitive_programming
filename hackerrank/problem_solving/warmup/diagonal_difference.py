#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the diagonalDifference function below.
def diagonalDifference(arr):
    lsum =0
    rsum =0
    l = len(arr)
    for i in range(l):
            lsum = lsum + arr[i][i]
            rsum = rsum + arr[i][l-1-i]
    
    if lsum > rsum:
        return lsum-rsum
    else:
        return rsum-lsum
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    result = diagonalDifference(arr)

    fptr.write(str(result) + '\n')

    fptr.close()

