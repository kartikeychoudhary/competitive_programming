n, d = list(map(int, input().split()))
a = list(map(int,  input().split()))

count = 0

for x in range(n):
    i = a[x]
    if i + d in a and i + 2*d in a:
        count+=1

print(count)

