import java.util.Scanner;
class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n1 = sc.nextInt();
 int n2 = sc.nextInt();
 System.out.println(getGreatest(n1, n2));
 }
 public static int getGreatest(int num1, int num2) {
 if (num1 < 0 || num2 < 0)
 return -1;
 if (num1 == 0 || num2 == 0)
 return -2;
 if (num1 > num2)
 return num1;
 return num2;
}
}
