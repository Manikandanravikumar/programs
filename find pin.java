/**Find PIN:
You are at Level-1 of a Maths game.
You are provided with 4 numbers: input1, input2, input3 and input4 and are expected to
find a secret PIN

The three numbers input1, input2 and input3 are four digit numbers within the range
>=1000 and <-9999. i.e.
1000<input1 <= 9999
1000<= input2 <= 9999
1000 <=input3 <= 9999
input4 is a positive integer number.

PIN=((MAX digit of input1 x MIN digit of input1) x (MAX digit of input2 x MIN digit of input2) x (MAX digit of input3 x MIN digit of input3)) - input4

Example - If input1 = 3521, input2-2452, input3-1352, and input4=38
then PIN = ((5 x 1) x (5 x2) x (5x 1)) - 38 = (5 x 10 x 5) - 38 = 212

Assuming that the 4 numbers are passed to the given function, Complete the function to find and return the PIN.**/

//CODE:

import java.util.*;
public class Main {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[4];
        int ind=0;
        int b=0;
        int c=1;
        for(int i=1; i<=3; i++){
            int a1=sc.nextInt();
            while (a1 > 0) {
                a[ind]=a1 % 10;
                a1 = a1 / 10;
                ind++;
            }
            ind=0;
            Arrays.sort(a);
            b=a[0]*a[3];
            c=c*b;
        }
        int d=sc.nextInt();
        System.out.println(c-d);
    }
}

//OUTPUT
3521  
2452
1352
38
212
