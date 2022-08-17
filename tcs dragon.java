//One dragon. Two dragon. Three dragon», - the princess was counting. She had trouble falling asleep, and she got bored of counting lambs when she was nine.
//However, just counting dragons was boring as well, so she entertained herself at best she could. Tonight she imagined that all dragons were here to steal her, and she was fighting them off. Every k-th dragon got punched in the face with a frying pan. Every I-th dragon got his tail shut into the balcony door. Every m-th dragon got his paws trampled with sharp heels. Finally, she threatened every n-th dragon to call her mom, and he withdrew in panic.
//How many imaginary dragons suffered moral or physical damage tonight, if the princess counted a total of d dragons?

//Input Format
//Input data contains integer numbers k, l, m, n and d, each number in a separate line.

//Constraints
//(1sk, l, m, n≤ 10,1sds 10^5)

//Output Format
O//utput the number of damaged dragons.

//Sample input:
//1
//2
//3
//4
//12
//Sample output:
//12



Program:
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int i;
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int c=0;
        for(i=1;i<=d;i++)
        {
            if(i%k==0||i%l==0||i%m==0||i%n==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}



Input:
1
2
3
4
12
Output:
12
