#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the marsExploration function below.
def marsExploration(s):
    st = 'SOS'
    count = 0
    diff=0
    for i in s:
        if count >= 3:
            count = 0
        if(st[count] != i):
            diff+=1
        count+=1

    
    return diff

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = marsExploration(s)

    fptr.write(str(result) + '\n')

    fptr.close()

