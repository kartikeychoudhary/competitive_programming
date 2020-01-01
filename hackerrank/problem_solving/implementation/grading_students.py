#!/bin/python3

import os
import sys

#
# Complete the gradingStudents function below.
#
def gradingStudents(grades):
    g = []
    for i in grades:
        if i >= 38:
            t=0
            while t<i:
                t+=5
            if t - i <3:
                g.append(t)
            if t - i == 3:
                g.append(i)
            if t - i > 3:
                g.append(i)
        else:
            g.append(i)
    
    return g

if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    grades = []

    for _ in range(n):
        grades_item = int(input())
        grades.append(grades_item)

    result = gradingStudents(grades)

    f.write('\n'.join(map(str, result)))
    f.write('\n')

    f.close()

