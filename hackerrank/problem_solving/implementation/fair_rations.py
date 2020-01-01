
n = int(input())

arr = list(map(int, input().split()))

sum = 0
car = 0
for x in arr:
    car = (car+x) % 2
    sum += car*2

if car:
    print("NO")
else:
    print(sum)
    

