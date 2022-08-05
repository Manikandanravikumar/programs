import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int odd=0;
        int even=0;
        for(int i=0; i<n.length(); i++){
            if(i%2==0){
                even+=n.charAt(i)-'0';
            }
            else{
                odd+=n.charAt(i)-'0';
            }
        }
        System.out.println(Math.abs(even-odd));
    }
}



Input : 4567
Output : 2
