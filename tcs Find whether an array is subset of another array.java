Program:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a = sc.nextInt();
	    int arr[] = new int[n];
	    int arr1[] = new int[a];
	    int c=0;
	    for(int j=0; j<n; j++){
	        arr[j]=sc.nextInt();
	    }
	    for(int j=0; j<a; j++){
	        arr1[j]=sc.nextInt();
	    }
	    for(int i=0; i<n; i++){
	        for(int j=0; j<a; j++){
	            if(arr[i]==arr1[j]){
	                c++;
	            }
	        }
	    }
	    if(c==a)
	    {
	        System.out.println("one array is subset to another array");
	    }
	    else{
	        System.out.println("one array is not subset to another array");
	    }
	}
}


Input:
5
3
1 2 3 4 5
1 2 3
Output:
one array is subset to another array

Input:
5
3 
1 2 3 4 5
1 2 6
Output:
one array is not subset to another array
