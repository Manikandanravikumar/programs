//Katie, Kuro and Shiro are best friends. They have known each other since kindergarten. That's why they often share everything with each other and work together on some
//very hard problems.
//Today is Shiro's birthday. She really loves pizza so she wants to invite her friends to the pizza restaurant near her house to celebrate her birthday, including her best friends
//Katie and Kuro.
//She has ordered a very big round pizza, in order to serve her many friends. Exactly n of Shiro's friends are here. That's why she has to divide the pizza into n+1 slices (Shiro also needs to eat). She wants the slices to be exactly the same size and shape. If not, some of her friends will get mad and go home early, and the party will be over.
//Shiro is now hungry. She wants to cut the pizza with minimum of straight cuts. A cut is a straight segment, it might have ends inside or outside the pizza. But she is too lazy to pick up the calculator.
//As usual, she will ask Katie and Kuro for help. But they haven't come yet. Could you help Shiro with this problem?

//Input Format
//A single line contains one non-negative integer n - the number of Shiro's friends. The circular pizza has to be sliced into n+1 pieces.

//Constraints
//(Osn≤10^18)

//Output Format
//A single integer - the number of straight cuts Shiro needs.

//Sample input:
//3
//Sample Output:
//2

  

Program:
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%2 != 0){
            System.out.println((n+1)/2);
        }
        else if((n%2 == 0) && n != 0){
            System.out.println(n+1);
        }
        else if(n==0){
            System.out.println("0");
        }
    }
}


Input:
3
Output:
2
