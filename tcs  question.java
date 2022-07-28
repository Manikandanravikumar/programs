/**Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types
of vehicle according to the given data below:

1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :

Input :
200  -> Value of V
540   -> Value of W

Output :
TW =130 FW=70

Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels**/


Program:
import java.util.*;
public class  Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int Vech = sc.nextInt();
        int Wheel = sc.nextInt();
        int l = ((4*Vech)-Wheel)/2;
        int m = l-Vech;
        System.out.println("TW : "+l);
        System.out.println("FW : "+Math.abs(m));
    }
}


Output : 
200
500
TW : 150
FW : 50
  
