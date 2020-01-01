#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the staircase function below.
def staircase(n):
    str = ''
    for i in range(n):
        for j in range(n-i-1):
            str += ' '
        
        for k in range(i+1):
            str += '#'
        
        str += '\n'
        
    print(str)

if __name__ == '__main__':
    n = int(input())

    staircase(n)

