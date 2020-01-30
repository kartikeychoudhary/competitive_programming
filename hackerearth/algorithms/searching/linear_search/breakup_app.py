'''
# Sample code to perform I/O:

name = input()                  # Reading input from STDIN
print('Hi, %s.' % name)         # Writing output to STDOUT

# Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
'''

# Write your code here
n = int(input())

messages = []

for _ in range(n):
    messages.append(input())

dates = {}
# print(n, messages)
for message in messages:
    if "G:" in message:
        credit = 2
    else:
        credit = 1
    # print(credit)
    date = []
    for char in message.split():
        if char.isnumeric():
            date.append(char)
    
    for d in date:
        if dates.get(d) == None:
            dates[d] = 1*credit
        else:
            dates[d] = dates[d] + credit*1
    
dates = dict(sorted(dates.items(), key=lambda x: x[1], reverse=True))
# max_date = int(dates.keys()[0])

flag = False
if len(list(dates.keys())) > 0:
    max_date = int(list(dates.keys())[0])
    #print(max_date)
    if max_date == 19 or max_date == 20:
        flag = True
    else:
        value = dates[list(dates.keys())[0]]
        
        for key in dates.keys():
            if value != dates[key]:
                break
            # value = dates[key]
            if key == 19 or key == 20:
                flag = True
        
if flag:
    print("Date")
else:
    print("No Date")
    
    
    
