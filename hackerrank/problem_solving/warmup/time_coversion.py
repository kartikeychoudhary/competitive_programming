#!/bin/python3

import os
import sys

#
# Complete the timeConversion function below.
#
def timeConversion(s):
    s = s.split(':')
    h = s[0]
    m = s[1]
    sec = s[2][:2]
    t = s[2][2:]
    if t == 'AM':
        if int(h) == 12:
            h = '00'
    if t == 'PM':
        if int(h)!=12:
             h = 12 + int(h)
            
    
    string = str(h) + ':' + m + ':' + sec
    return string
    
if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    f.write(result + '\n')

    f.close()

