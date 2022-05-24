import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        int n=0;
        int input1 = 197;
        if(input1>=-9 && input1<=9)
        {
            System.out.println("-1");
        }
        if(input1>10)
        {
            input1*=-1;
            input1/=10;
            n = input1%10;
        }
        System.out.println(n);
    }
}
