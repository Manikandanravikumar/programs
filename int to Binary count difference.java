**********int to Binary count difference*********
import  java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    String l = Integer.toBinaryString(a);
	    String l1 = Integer.toBinaryString(b);
	    int count=0;
	    int j=0;
	    String lr = l;
	    String sm = l1;
	    int n = l.length();
	    int n1 = l1.length();
	    if (n>n1)
	    {
	        lr = l;
	        sm = l1;
	        int temp = n;
	        n = n1;
	        n1=temp;
	    }
	    int c = n1-n;
	    String x="";
	    while(c>0){
	        x = x+"0";
	        j++;
	        c--;
	    }
	    x = x+sm;
	    int d = x.length();
	    
	    for (int i=0; i<d; i++)
	    {
	        if (x.charAt(i) != lr.charAt(i))
	        count++;
	    }
	    System.out.println(count);
	}
}
