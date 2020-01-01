p, d, m, s = list(map(int,  input().split()))

count = 0
flag = True
while s >= 0:
    if flag:
        s = s - p
        flag = False
        count+=1
        p = p - d
    else:
        if p > m:
            s = s - p
            p = p - d
            count+=1
        else:
            s = s - m
            count+=1

count -= 1
print(count)
    
        

