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
        int c=0;
		if(input1%2!=0)
		{
			c++;
		}
		if(input2%2!=0)
		{
			c++;
		}
		if(input3%2!=0)
		{
			c++;
		}
		if(input4%2!=0)
		{
			c++;
		}
		if(input5%2!=0)
		{
			c++;
		}
        System.out.println(c);
    }
}
