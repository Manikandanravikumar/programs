import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[]=new int[n];
	    int left_sum = 0;
	    int right_sum = 0;
	    int i,j;
	    for(i=0; i<n; i++){
	        arr[i]=sc.nextInt();
	    }
	    int m = n/2;
	    for(i=0; i<m; i++){
	        left_sum+=arr[i];
	    }
	    for(i=n-1; i>m; i--){
	        right_sum+=arr[i];
	    }
	    if(left_sum==right_sum){
	            System.out.println(m);
	    }
	    else{
	        System.out.println("-1");
	    }
	}
}



Input:
arr size : 7
array elements : -7 1 5 2 -4 3 0

Output:
3
