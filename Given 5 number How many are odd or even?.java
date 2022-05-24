import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        int input4=sc.nextInt();
        int input5=sc.nextInt();
        String input6=sc.nextLine();
        		int a=0;
    int b=0;
    if(input1%2==0)
    {
        a++;
    }
    else
    {
        b++;
    }
    if(input2%2==0)
    {
        a++;
    }
    else
    {
        b++;
    }
    if(input3%2==0)
    {
        a++;
    }
    else
    {
        b++;
    }
    if(input4%2==0)
    {
        a++;
    }
    else
    {
        b++;
    }
    if(input5%2==0)
    {
        a++;
    }
    else
    {
        b++;
    }
    System.out.println(input6.equals("even")?a:b);
	}
}
