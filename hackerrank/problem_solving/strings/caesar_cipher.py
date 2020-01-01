#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the caesarCipher function below.

arr = list(map(chr, range(ord('A'), ord('Z')+1)))
arr2 = list(map(chr, range(ord('a'), ord('z')+1)))

def caesarCipher(s, k):
    s = list(s)

    for i in range(len(s)):
        if s[i] in arr:
           value = arr.index(s[i]) + k % 26
           if value >= 26:
               value -= 26
           s[i] = arr[value]
        elif s[i] in arr2:
            value = arr2.index(s[i]) + k % 26
            if value >= 26:
               value -= 26
            s[i] = arr2[value]

    temp = ""
    for i in s:
        temp+=i

    return temp

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    s = input()

    k = int(input())

    result = caesarCipher(s, k)

    fptr.write(result + '\n')

    fptr.close()

