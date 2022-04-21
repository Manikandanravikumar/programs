**********right alphabetic triangle**********
public class Main
{            
    public static void main(String[] args)
    {
        int alphabet = 65;
        for (int i = 0; i <= 2; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char)(alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
 
Output:
A
A B
A B C
 
