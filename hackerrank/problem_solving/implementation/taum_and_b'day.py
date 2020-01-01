for _ in range(int(input())):
    b, w = list(map(int, input().split()))
    bc, wc, z = list(map(int, input().split()))
    print(min(b * bc + w * wc, bc * (b + w) + w * z, wc * (b + w) + b * z))
