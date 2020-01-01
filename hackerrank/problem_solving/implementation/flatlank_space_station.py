

c, s = list(map(int, input().split()))

sarr = list(map(int, input().split()))

arr = sorted(sarr)
maxi = max(arr[0], c-arr[-1]-1)

for i in range(1, s):
    d = arr[i] - arr[i-1]
    maxi = max(d//2, maxi)


print(maxi)

