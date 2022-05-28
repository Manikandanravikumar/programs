import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int input=sc.nextInt();
	    int f=0;
	    for(int i=2; i<=input/2; i++)
	    {
		    if(input%i==0)
	    	f=1;
	    }
	    if(f==0)
	    System.out.println("prime");
	    else
	    System.out.println("not prime");
	}
}
