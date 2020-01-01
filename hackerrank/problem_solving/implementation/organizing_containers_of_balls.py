tests = int (input ())
for test in range (tests):
    n = int (input ())
    sr = [0] * n
    sc = [0] * n
    for i in range (n):
        row = list(map(int, input().split()))
        for j in range (n):
            sr[i] += row[j]
            sc[j] += row[j]
    print ("Possible" if sorted (sr) == sorted (sc) else "Impossible")
