#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the closestNumbers function below.
def closestNumbers(arr):
    arr.sort()
    pairs = []
    minDiff = 1000000000000001
    for i in range(1,len(arr)):
        d = abs(arr[i] - arr[i-1])
        if d < minDiff:
            pairs = [arr[i-1],arr[i]]
            minDiff = d
        elif d == minDiff:
            pairs.extend([arr[i-1],arr[i]])
            
    return pairs

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    result = closestNumbers(arr)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()

