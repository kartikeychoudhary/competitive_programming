#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the happyLadybugs function below.
def happyLadybugs(b):
    print(set(b))
    for x in set(b):
        if x != "_" and b.count(x) == 1:
            return "NO"
    
    if b.count("_") == 0:
        for i in range(1,n-1):
            if b[i-1]!=b[i] and b[i+1]!=b[i]:
                return "NO"
                
    return "YES"
    if b.count("_") == 0:
        for i in range(1,n-1):
            if b[i-1]!=b[i] and b[i+1]!=b[i]:
                return "NO"
    return "YES"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    g = int(input())

    for g_itr in range(g):
        n = int(input())

        b = input()

        result = happyLadybugs(b)

        fptr.write(result + '\n')

    fptr.close()

