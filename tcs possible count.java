Program:
import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n=sc.nextInt(); //5
   int v=sc.nextInt(); //2
   int c=0;
   int a[]=new int[n];
   for(int i=0; i<n; i++){
       a[i]=sc.nextInt();   //1 2 3 4 5
   }
   for(int i=0; i<n; i++){
       for(int j=0; j<n; j++){
           if(a[i]-a[j]==v){ //2 == 2
               c++;
           }
       }
   }
   System.out.println(c);
}
}


Input:
5
2
1 5 3 4 2

Output:
3
