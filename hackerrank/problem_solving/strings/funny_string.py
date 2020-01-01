#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the funnyString function below.
def funnyString(s):
    rs = s[::-1]
    flag = True
    print(s, rs)
    r1 = []
    r2 = []
    for x in range(len(s)-1):
        r1.append(abs(ord(s[x])-ord(s[x+1])))
        r2.append(abs(ord(rs[x])-ord(rs[x+1])))
    
    if r1 == r2:
        return "Funny"
    else:
        return "Not Funny"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s = input()

        result = funnyString(s)

        fptr.write(result + '\n')

    fptr.close()

