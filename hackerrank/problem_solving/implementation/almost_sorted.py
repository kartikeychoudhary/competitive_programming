#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the almostSorted function below.
def almostSorted(arr):
    srt = list(arr)
    srt.sort()
    cnt = 0
    ind = []
    for i in range(len(arr)):
        if srt[i] != arr[i]:
            cnt+=1
            ind.append(i)

    if cnt == 2:
        temp = arr[ind[0]]
        arr[ind[0]] = arr[ind[1]]
        arr[ind[1]] = temp
        if arr == srt:
            print("yes")
            print("swap", ind[0]+1, ind[1]+1, sep=" ")
            return None
            
    if cnt>2:
        a1=[]
        a2=[]
        for i in ind:
            a1.append(srt[i])
            a2.append(arr[i])
        
        a2 = a2[::-1]
        if a1 == a2:
            print("yes")
            print("reverse", ind[0]+1,ind[-1]+1, sep=" ")
            return None
            
        else:
            print("no")
            return None
    print("no")
    

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    almostSorted(arr)

