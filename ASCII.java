public class Main
{            
    public static void main(String[] args)
    {
        int alphabet = 65;
        for (int i = 0; i <= 2; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}

Output:
65
65 66
65 66 67
