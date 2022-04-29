import java.util.*;
public class Main{
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           insertionSort(ar);
    }
    static void insertionSort(int[] ar) {
        int count =0;              
        for(int i=1;i<ar.length;i++){	                  
            int n= ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>n){	
                ar[j+1]=ar[j];			
                j--;
                count++;            
            }
            ar[j+1]= n;           
        }	
        System.out.println(count);
    }
}
