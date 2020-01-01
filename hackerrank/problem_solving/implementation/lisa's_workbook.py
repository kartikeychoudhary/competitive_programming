#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the workbook function below.
def workbook(n, k, arr):
    pages = 0
    hp = 0
    lp = 0
    sp = 0
    ch=0
    while(ch<len(arr)):
        lp = hp + 1
        pages += 1
        
        if hp+k>arr[ch]:
            hp = arr[ch]
        else:
            hp += k
        
        if pages <= hp and pages>= lp:
            sp+=1
        if hp==arr[ch]:
            ch+=1
            hp=0
            lp=0
            
    return sp

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    arr = list(map(int, input().rstrip().split()))

    result = workbook(n, k, arr)

    fptr.write(str(result) + '\n')

    fptr.close()

