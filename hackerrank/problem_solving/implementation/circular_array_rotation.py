n, k, q = map(int, input().split())
arr = list(map(int, input().split()))
for _ in range(q):
    t = int(input())
    t = arr[(t + n - k) % n]
    print(t)

