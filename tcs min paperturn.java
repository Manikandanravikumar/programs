Program:
import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   int v=sc.nextInt();
   int count=0;
   if(n%2==0){
       n++;
   int l=(v+1)/2;
   int l1=(n-v+1)/2;
   System.out.println(Math.min(l,l1));
   }
}
}


Input:
6
2
Output:
1
