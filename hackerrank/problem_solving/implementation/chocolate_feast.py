t = int(input())

for _ in range(t):
    n, c, m = list(map(int,  input().split()))
    choc = wrappers = n // c

    while (wrappers >= m):
        choc+= 1
        wrappers -= m - 1 
    print(choc)

