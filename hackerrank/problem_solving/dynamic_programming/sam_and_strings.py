#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the substrings function below.
def substrings(n):
    l = len(n)
    sd = []
    sd.append(int(n[0]))
    sum = sd[0]
    for i in range(1, l):
        ni = int(n[i])
        t = (i+1)*ni + 10*sd[i-1]
        sd.append(t%1000000007)
        
        sum+= sd[i]
        sum=sum%1000000007
        
    return sum

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = input()

    result = substrings(n)

    fptr.write(str(result) + '\n')

    fptr.close()

