n = int(input())
a = list(map(int,  input().split()))

count = 0

dis = 10000
for x in range(n-1):
    i = a[x]
    for y in range(x+1, n):
        if i == a[y]:
            if abs(y - x) < dis:
                dis = abs(y - x)
if dis == 10000:
    print(-1)
else:
    print(dis)

