n, m, g = list(map(int, input().split()))

rain = list(map(int, input().split()))

cloth = list(map(int, input().split()))

taken = 0
time_gone = rain[0]

for time in range(1,len(rain)):
    t = rain[time]
    count = 0
    for i in range(len(cloth)):
        if t - time_gone >= cloth[i] and cloth[i] >= 0:
            taken+=1
            cloth[i] = -1
            count+=1
            if count == g:
                break
        
    time_gone=t
    
print(taken)
