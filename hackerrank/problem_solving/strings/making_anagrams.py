#!/bin/python

import math
import os
import random
import re
import sys
import string

# Complete the makingAnagrams function below.
def makingAnagrams(s1, s2):
    cost=0
    for i in string.ascii_lowercase:
        cost += abs(s1.count(i)-s2.count(i))
    return cost

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s1 = raw_input()

    s2 = raw_input()

    result = makingAnagrams(s1, s2)

    fptr.write(str(result) + '\n')

    fptr.close()

