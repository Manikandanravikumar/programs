T = int(input())
for x in range(T):
  n = int(input())
  arr=list(map(int,input().split()))
  arr.sort(reverse=False)
print(*arr)
