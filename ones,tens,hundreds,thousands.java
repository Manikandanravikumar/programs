//CODE:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n = 1234;
		int on = n%10;
        int ten = (n/10)%10;
        int hun = (n/100)%10
        int tho = (n/1000);
        System.out.println(on);
        System.out.println(ten);
        System.out.println(hun);
        System.out.println(tho);
	}
}



//OUTPUT:
4
3
2
1
