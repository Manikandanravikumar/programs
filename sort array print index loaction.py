val = int(input())
size = int(input())
arr = [int(i) for i in input().split()]
x = 0
for j in arr:
    if val == j:
        break
    x = x+1
print(x)
          
