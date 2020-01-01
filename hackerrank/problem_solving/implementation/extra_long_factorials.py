#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the extraLongFactorials function below.
def extraLongFactorials(n):
    print(fact(n))
 
    
def fact(n):
    if n == 0:
        return 1
    
    return n*fact(n-1)
    
if __name__ == '__main__':
    n = int(input())

    extraLongFactorials(n)

