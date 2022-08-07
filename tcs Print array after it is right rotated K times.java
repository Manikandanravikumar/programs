import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a = sc.nextInt();
	    int arr[]=new int[n];
	    int k=a%n;
	    for(int i=0; i<n; i++){
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0; i<n; i++){
	        if(i<k){
	            System.out.print(arr[n+i-k]+" ");
	        }
	        else{
	            System.out.print(arr[i-k]+" ");
	        }
	    }
	    System.out.println();
	}
}



Input:
7
2
1 2 3 4 5 6 7
Output:
6 7 1 2 3 4 5 
  
Input: 
6
3
1 3 5 7 9 11
Output:
7 9 11 1 3 5 
  
Input:
5
2
1 2 3 4 5
Output:
4 5 1 2 3
