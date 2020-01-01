n = int(input())
arr = list(map(int, input().split()))

while len(arr) > 0:
    print(len(arr))
    mini = min(arr)
    for i in range(len(arr)):
        arr[i]-=mini
    arr = list(filter(lambda a: a != 0, arr))

