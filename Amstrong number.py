n = int(input("Enter a number: "))
s = 0
t = n
while t > 0:
   digit = t % 10
   s += digit ** 3
   t //= 10
if n == s:
   print("Armstrong number")
else:
   print("not a Armstrong number")
