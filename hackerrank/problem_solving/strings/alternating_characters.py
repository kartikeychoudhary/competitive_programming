import re

t = int(input())

for _ in range(t):
    s = input()
    print(len(s)-len(re.findall('A+|B+',s)))

