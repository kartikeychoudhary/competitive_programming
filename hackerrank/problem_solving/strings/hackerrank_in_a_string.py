#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the hackerrankInString function below.
def hackerrankInString(s):
    t = "hackerrank"
    for i in t:
        if i not in s:
            return "NO"
        else:
            val = s.index(i)
            t = s[val+1:]
            print(s, t, s.index(i))
            s=t

    return "YES"
    
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s = input()

        result = hackerrankInString(s)

        fptr.write(result + '\n')

    fptr.close()

