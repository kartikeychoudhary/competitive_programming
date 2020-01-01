n = int(input())
arr = list(map(int,  input().split()))

temp = arr

flag = 0

mini = min(arr)
maxi = max(arr)

for i in range(mini, maxi+1):
    t = temp
    t = list(filter(lambda a: a == i, t))
    l = len(t)
    #Wprint(t)
    if flag < l:
        flag=l

result = len(temp) - flag

print(result)

