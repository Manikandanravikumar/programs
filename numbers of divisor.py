r _ in range(int(input())):
    n, k = [int(i) for i in input().split()]
    x=0
    while n!=0:
        q = n // k
        x += (((n * (n + 1)) // 2) - ((q * (q + 1)) // 2) * k)
        n = q
    print(x)
