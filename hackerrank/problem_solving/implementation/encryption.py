#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the encryption function below.
def encryption(s):
    s.replace(' ', '')
    l=len(s)
    temp = math.sqrt(l)
    print(temp)
    uv = math.ceil(temp)
    lv = math.floor(temp)
    while l > uv*lv:
        lv+=1
    while len(s)< uv*lv:
        s+='~'
    arr= [['' for i in range(uv)] for j in range(lv)]
    print(arr)
    i=0
    for r in range(lv):
        for c in range(uv):
            if s[i] != '~':
                arr[r][c] = s[i]
                
            print(i)
            i+=1

    string = ''
    
    for c in range(uv):
        for r in range(lv):
            string+=arr[r][c]
        
        string+=' '
        
    return string
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = encryption(s)

    fptr.write(result + '\n')

    fptr.close()

