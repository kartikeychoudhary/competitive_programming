n = int(input())

r = 3

while n > r:
    n = n - r
    r *= 2

print(r-n+1)
