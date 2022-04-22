import java.util.Scanner;
 class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String s1 = sc.nextLine();
 int n = UserMainCode.display(s1);
 if(n==1){
 System.out.println("Valid password");
 }else{
 System.out.println("Invalid password");
 }
 }
}
class UserMainCode {
 
 
 public static int display(String password){
if(password.matches(".*[A-Z]{1,}.*") && password.matches(".*[a-z]{1,}.*") && password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*") && password.length()>=6 && password.length()<=20)
 {
 return 1;
 }
 else
 {
 return -1;
 }
 }
 }


//OUTPUT

Github@1234
Valid password


GITHUB12345
Invalid password
