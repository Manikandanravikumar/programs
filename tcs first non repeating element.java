Program:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[]=new int[n];
	    int a1[]=new int[n];
	    for(int i=0; i<n; i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0; i<n; i++){
	        a1[i]=0;
	    }
	    int j;
	    for(int i=0; i<n; i++){
	        for(j=0; j<n; j++){
	            if(i!=j && a[i]==a[j]){
	                a1[i]++;
	            }
	        }
	    }
	    for(int i=0; i<n; i++){
	        if(a1[i]==0){
	            System.out.println(a[i]);
	            break;
	        }
	    }
	}
}

INPUT
5
1 2 1 3 2

OUTPUT
3


****************************************************************


public class Main {
  static int firstNonRepeating(int arr[], int n)
  {
    for (int i = 0; i < n; i++) {
      int j;
      for (j = 0; j < n; j++)
        if (i != j && arr[i] == arr[j])
          break;
      if (j == n)
        return arr[i];
    }
    return -1;
  }
  public static void main(String[] args)
  {
    int arr[] = {1, 2, 1, 3, 2};
    int n = arr.length;
    System.out.print(firstNonRepeating(arr, n));
  }
}


OUTPUT
3
