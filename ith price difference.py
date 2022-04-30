t=int(input())
while t:
    t-=1
    n=int(input())
    l=list(map(int,input().split()))
    c=1
    print(1,end=" ")
    for i in range(1,n):
        if l[i]>=max(l[:i]):
            print(i+1,end=" ")
        else:
            print(c,end=" ")
