#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the biggerIsGreater function below.
def biggerIsGreater(w):
    t = list(w)
    l = len(w)
    for i in range(l-1):
        if t[l-i-2] < t[l-i-1]:
            pivot = t[l-i-2]
            
            suffix = t[l-i-2:]
            print(suffix)
            for j in range(len(suffix)-1, 0, -1):
                if suffix[0]<suffix[j]:
                    temp = suffix[0]
                    suffix[0] = suffix[j]
                    suffix[j] = temp
                    break
            print(suffix)
            temp = suffix[1:]
            temp = temp[::-1]
            temp.insert(0, suffix[0])
            suffix = temp
            string = ''
            for j in range(l-i-2):
                string += t[j]
                
            for j in range(len(suffix)):
                string += suffix[j]
            return string
    
    return "no answer"
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    T = int(input())

    for T_itr in range(T):
        w = input()

        result = biggerIsGreater(w)

        fptr.write(result + '\n')

    fptr.close()

