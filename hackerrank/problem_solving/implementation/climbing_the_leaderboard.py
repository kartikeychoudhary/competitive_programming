#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the climbingLeaderboard function below.
def binarySearch (arr, l, r, x): 
    if r >= l: 
        mid = int(l + (r - l)/2)
        if arr[mid] == x: 
            return mid 

        elif arr[mid] < x: 
            return binarySearch(arr, l, mid-1, x) 
        else: 
            return binarySearch(arr, mid + 1, r, x) 
    else: 
        return l

def climbingLeaderboard(scores, alice):
    sco = sorted(list(set(scores)))[::-1]
    res = []
    for i in range(len(alice)):
        if alice[i] >= sco[0]:
            res.append(1)
        elif alice[i] < sco[len(sco)-1]:
            res.append(len(sco)+1)
        else:
            res.append(binarySearch(sco, 0, len(sco), alice[i])+1)
    
    return res
        
    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    scores_count = int(input())

    scores = list(map(int, input().rstrip().split()))

    alice_count = int(input())

    alice = list(map(int, input().rstrip().split()))

    result = climbingLeaderboard(scores, alice)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()

