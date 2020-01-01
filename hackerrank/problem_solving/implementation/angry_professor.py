t = int(input())

for _ in range(t):
    n, k = list(map(int, input().split()))
    arr = list(map(int, input().split()))

    count = 0
    for i in arr:
        if i <= 0:
            count+=1

    if count >= k:
        print("NO")
    else:
        print("YES")

