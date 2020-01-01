#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the getWays function below.
def getWays(n, c):
    c.sort()
    k = (n+1)*[0]
    k[0]=1
    temp = k
    for i in range(n+1):
        if i>=c[0]:
            if i % c[0] == 0:
                temp[i] = 1    
    for i in range(1,len(c)):
        for j in range(c[i], n+1):
            if j >= c[i]:
                k[j] = temp[j] + temp[j-c[i]]
            else:
                k[j] = temp[j]
        
        temp=k
            
                
    return (k[-1])

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    c = list(map(int, input().rstrip().split()))

    # Print the number of ways of making change for 'n' units using coins having the values given by 'c'

    ways = getWays(n, c)
    fptr.write(str(ways) + '\n')
    fptr.close()

