//Find Sum of number in array to get target number and print their index
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int a[]=new int[2];
	    a[0]=1;
	    a[0]=1;
	    for(int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int t=sc.nextInt();
	    for(int i=0; i<arr.length; i++){
	        for(int j=i+1; j<arr.length; j++){
	            if(arr[i]+arr[j]==t)
	            {
	                a[0]=i;
	                a[1]=j;
	                System.out.println(Arrays.toString(a));
	            }
	        }
	    }
	}
}

//Output:
Test case 1:
4
3 2 6 1
9
[0, 2]

Test case 2:
4
3 2 3 2
5
[0, 1]
[0, 3]
[1, 2]
[2, 3]

Test case 3:
4
3 4 2 5
5
[0, 2]
