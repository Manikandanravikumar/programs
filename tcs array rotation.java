Program:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a = sc.nextInt();
	    int arr[]=new int[n];
	    int arr1[]=new int[n];
	    int c=0;
	    for(int i=0; i<n; i++){
	        arr[i]=sc.nextInt();
	    }
	    for(int i=a; i<n; i++){
	        arr1[c]=arr[i];
	        c++;
	    }
	    for(int i=0; i<a; i++){
	        arr1[c]=arr[i];
	        c++;
	    }for(int i=0; i<n; i++){
	        System.out.print(arr1[i]+" ");
	    }
	}
}

Input:
array size : 7
Position : 2            
array elements : 1 2 3 4 5 6 7

Output:
3 4 5 6 7 1 2 
