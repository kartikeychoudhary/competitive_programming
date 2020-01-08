t = int(input())

vowels = ['a', 'e', 'i', 'o', 'u']

for _ in range(t):
    trees = input()
    count = 0
    for tree in trees:
        if tree.lower() in vowels:
            count+=1

    print(count)
