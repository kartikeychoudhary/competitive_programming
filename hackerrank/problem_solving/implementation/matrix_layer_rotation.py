#!/bin/python3

import math
import os
import random
import re
import sys
import copy
# Complete the matrixRotation function below.
#    for i in range(matrix)

if __name__ == '__main__':
    mnr = input().rstrip().split()

    m = int(mnr[0])

    n = int(mnr[1])

    rot = int(mnr[2])

    mat = []

    for _ in range(m):
        mat.append(list(map(int, input().rstrip().split())))
    x = min(m, n) / 2
    r = []
    
    for i in range(int(x)):
        row = []
        for j in range(i, m - 1 - i):
            row.append(mat[j][i])
        for j in range(i, n - 1 - i):
            row.append(mat[m - 1 - i][j])
        for j in range(m - 1 - i, i, -1):
            row.append(mat[j][n - 1 - i])
        for j in range(n - 1 - i, i, -1):
            row.append(mat[i][j])
        r.append(row)
    
    result = copy.deepcopy(mat)
    
    for i in range(int(x)):
        row = r[i]
        #print(row)
        rotate = rot % len(row)
        idx = -rotate
        
        for j in range(i, m - 1 - i):
            result[j][i] = row[idx]
            idx += 1
            idx %= len(row)
        for j in range(i, n - 1 - i):
            result[m - 1 - i][j] = row[idx]
            idx += 1
            idx %= len(row)
        for j in range(m - 1 - i, i, -1):
            result[j][n - 1 - i] = row[idx]
            idx += 1
            idx %= len(row)
        for j in range(n - 1 - i, i, -1):
            result[i][j] = row[idx]
            idx += 1
            idx %= len(row)
for i in result:
    print (" ".join(map(str, i)))
    
