
s = input()
temp = [0 for i in range(26)]
s = s.lower()
for i in s:
    if i != ' ':
          t = ord(i) - ord('a')
          #print(t)
          temp[t] = 1

temp.sort()
if temp[0] == 0:
      print("not pangram")
else:
      print("pangram")
        

