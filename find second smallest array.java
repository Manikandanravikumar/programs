import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i;
	    int j;
	    int arr[]= new int[n];
	    for(i=0; i<n; i++){
	        arr[i]=sc.nextInt();
	    }
	    for(i=0; i<n; i++){
	        for(j=i+1; j<n; j++)
	        {
	            int temp;
	            if (arr[i]>arr[j])
	            {
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    System.out.println(arr[1]);
	}
}



Input: 
5
1 5 2 3 4
Output:
2

