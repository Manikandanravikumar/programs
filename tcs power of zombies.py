#Bangalore City, where peace prevails most of the time. Not everyone is a huge fan of peace, though. Certainly not Mr. XYZ, whose identity is not known to us - 
#yet. Mr. XYZ has somehow managed to bring vampires and zombies to Bangalore City to attack and destroy the city.

#Fatal Eagle, an ordinary citizen of the city is extremely worried on seeing his city being attacked by these weird creatures. But, as of now, he has no power to
#stop these creatures from their silent attacks. He wants to analyze these creatures firstly. He figured out some things about these creatures, like:

#Zombies have power in terms of an EVEN number.
#Vampires have power in terms of an ODD number.

#If he sees a zombie or a vampire, he marks them in his list with their power. After generating the entire list of power of these creatures, he decides to 
#arrange this data in the following manner:

#All the zombies arranged in sorted manner of their power, followed by the total power of zombies.
#All the vampires arranged in sorted manner of their power, followed by the total power of vampires.
#You've to help him produce the following list to help him save his city.

#Input constraints:
#The first line of input will contain an integer — N, denoting the number of creatures. The next line will contain N integers denoting the elements of the list 
#containing the power of zombies and vampires.

#Output constraints:
#Print the required list in a single line.

#Constraints:
#1 ≤ N ≤ 103
#1 ≤ Ni ≤ 103

-------------------------------------------------------------------------------------


Program: 
t=int(input())
arr=list(map(int,input().split()))
k=[]
g=[]
for i in range(len(arr)):
    if(arr[i]%2==0):
        k.append(arr[i])
    else:
        g.append(arr[i])
k.append(sum(k))
g.append(sum(g))
k=sorted(k)
g=sorted(g)
print(*k+g)


Input: 
6
2 3 10 12 15 22
Output:
2 10 12 22 46 3 15 18

