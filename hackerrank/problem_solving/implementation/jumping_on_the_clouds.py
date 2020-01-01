n = int(input())
c = list(map(int, input().split()))

jumps, i = 0, 0
while i < len(c)-1:
    # if 2 cloud jumps
    if i+2 < len(c) and c[i+2] != 1:
        i += 1
    jumps += 1
    i += 1

print(jumps)

