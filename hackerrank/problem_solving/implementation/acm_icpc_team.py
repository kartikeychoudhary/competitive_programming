#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the acmTeam function below.
def acmTeam(topic):
    maxi = 0
    tt = []
    for i in range(len(topic)-1):
        for j in range(i+1, len(topic)):
            for k in range(len(topic[i])):
                if topic[i][k]=='1' or topic[j][k]=='1':
                    maxi+=1
            tt.append(maxi)
            maxi = 0
            
    r1 = max(tt)
    r2 = tt.count(r1)

    result = []
    result.append(r1)
    result.append(r2)
    
    return result

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    topic = []

    for _ in range(n):
        topic_item = input()
        topic.append(topic_item)

    result = acmTeam(topic)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()

