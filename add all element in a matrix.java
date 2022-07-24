import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    int sum=0;
	    //Declare the matrix values
	    int[][] mat = new int[m][n];
	    //Read the matrix values
	    for(int i=0; i<m; i++){
	        for(int j=0; j<n; j++){
	            mat[i][j] = sc.nextInt();
	        }
	    }
	    //Display the element in the matrix format 
	    for(int i=0; i<m; i++){
	        for(int j=0; j<n; j++){
	            System.out.print(mat[i][j]+" ");
	        }
	        System.out.println("");
	    }
	    //Add the all element in the matrix
	    for(int i=0; i<m; i++){
	        for(int j=0; j<n; j++){
	            sum = sum+mat[i][j];
	        }
	    }
	    System.out.println(sum);
	}
}

OUTPUT
row : 2
col : 3
values
3
5 
7
9
11
13
matrix format  
3 5 7 
9 11 13
sum of values  
48
