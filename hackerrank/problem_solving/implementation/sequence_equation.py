def p(x):
    global arr
    return arr[x-1]

n = input()
arr = list(map(int, input().split()))
brr = list(map(lambda x:p(p(x)), arr))
for i in arr:
    print(brr.index(i) + 1)
