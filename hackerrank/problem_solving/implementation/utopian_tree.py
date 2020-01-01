#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the utopianTree function below.
def utopianTree():
    temp = []
    s = 1
    temp.append(s)
    for i in range(61):
        
        if i % 2 == 0:
            s*=2
        else:
            s+=1
        temp.append(s)
        
    return temp

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    temp= utopianTree()
    
    
    for t_itr in range(t):
        n = int(input())
        

        result = temp[n]

        fptr.write(str(result) + '\n')

    fptr.close()

